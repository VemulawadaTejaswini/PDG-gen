
import java.io.*;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is;
                String ia[];
                while((is = in.readLine()) != null){
                        int l = 7;
                        int n = Integer.parseInt(is);

                        int[][] num = new int[n][2];

                        int[] count = new int[l];
                        boolean[] p = new boolean[l];
                        Arrays.fill(p,false);
                        boolean[] use = new boolean[n];
                        Arrays.fill(use,true);

                        ia = in.readLine().split(" ");
                        for(int i = 0;i < n; ++i){
                                int s = Integer.parseInt(ia[i]);
                                num[i][0] = (int) (Math.floor(s/10)+0.01);
                                num[i][1] = s%10;
                                if(num[i][0] == num[i][1]){
                                        p[num[i][0]] = true;
                                        use[i] = false;
                                }
                                ++count[num[i][0]];
                                ++count[num[i][1]];
                        }

                        int c = 0;
                        for(int i = 0;i < l; ++i){
                                if(count[i]%2 == 1){
                                        ++c;
                                }
                        }
                        if(c != 2 && c != 0){
                                System.out.println("No");
                                continue;
                        }
                        if(n == 1){
                                System.out.println("Yes");
                                continue;
                        }
                        for(int i = 0;i < l; ++i){
                                if(count[i] == 2 && p[i]){
                                        System.out.println("No");
                                }
                        }

                        if(c == 2){
                                int[] a = new int[2];
                                int b = 0;
                                for(int i = 0;i < l; ++i){
                                        if(count[i]%2 == 1){
                                                a[b] = i;
                                                ++b;
                                        }
                                }

                                for(int i = 0;i < n; ++i){
                                        if(num[i][0] == a[0] || num[i][1] == a[0] ||
                                           num[i][0] == a[1] || num[i][1] == a[1]){
                                                if(mfs(num,use,i)){
                                                        System.out.println("Yes");
                                                        break;
                                                }
                                        }
                                }
                        } else if(mfs(num,use)){
                                System.out.println("Yes");
                        } else {
                                System.out.println("No");
                        }
                }
        }
        static boolean mfs(int[][] num, boolean[] use){
                return mfs(num,use,-1);
        }
        static boolean mfs(int[][] num, boolean[] yet, int x){
                int s,e;
                if(x == -1){
                        s = 0;  e = num.length;
                } else {
                        s = x;  e = x+1;
                }
                for(int i = s;i < e; ++i){
                        if(mfw(num,yet,i,num[i][0])){
                                return true;
                        }
                        if(mfw(num,yet,i,num[i][1])){
                                return true;
                        }
                }
                return false;

        }
        static boolean mfw(int[][] num, boolean[] yet, int n, int s){
                yet[n] = false;
                if(!chk(yet)){
                        return true;
                }
                for(int i = 0;i < num.length; ++i){
                        if(yet[i]){
                                if(num[i][0] == s){
                                        if(mfw(num,yet,i,num[i][1])){
                                                return true;
                                        }
                                }
                                if(num[i][1] == s){
                                        if(mfw(num,yet,i,num[i][0])){
                                                return true;
                                        }
                                }
                        }
                }
                yet[n] = true;
                return false;
        }
        static boolean chk(boolean[] p){
                for(int i = 0;i < p.length; ++i){
                        if(p[i]){
                                return true;
                        }
                }
                return false;
        }
}