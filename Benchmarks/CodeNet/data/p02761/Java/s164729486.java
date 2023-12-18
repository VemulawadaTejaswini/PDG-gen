import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int list [] = new int[n];
        Arrays.fill(list,0);
        if(m>0) {
            boolean check = true;
            for (int i = 0; i < m; i++) {
                int s = sc.nextInt();
                int c = sc.nextInt();
                if(s==1&&c==0&&n!=1){
                    check = false;
                    break;
                }
                if(list[s-1]!=0&&c!=list[s-1]){
                    check = false;
                    break;
                }
                list[s-1]=c;
            }
                if (n != 1 && check == false) System.out.println(-1);
                else if (n != 1 && list[0] == 0 && check == true) {
                    list[0] = 1;
                    StringBuilder opt = new StringBuilder();
                    for (int i : list) opt.append(i);
                    System.out.println(opt);
                }
                else{
                StringBuilder opt = new StringBuilder();
                for (int i : list) opt.append(i);
                System.out.println(opt);
                }
        }
        else if(m==0) {
            if(n==1) System.out.println(0);
            else {
                list[0]=1;
                StringBuilder opt = new StringBuilder();
                for (int i : list) opt.append(i);
                System.out.println(opt);
            }
        }
    }
}
