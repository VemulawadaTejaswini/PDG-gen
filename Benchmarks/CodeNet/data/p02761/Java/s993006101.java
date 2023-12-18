import java.util.*;

public class Main {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),M=sc.nextInt();
        char[] num = new char[N];
        int[] f = new int[N];
        Arrays.fill(num,'0');
        Arrays.fill(f,0);
        boolean flag = true;
        for(int i=0;i<M;i++){
            int s=sc.nextInt();
            char c=sc.next().charAt(0);
            if(num[s-1]!=c){
                f[s-1]++;
            }
            num[s-1] = c;
        }
        for(int i=0;i<N;i++){
            if(f[i]>1){
               flag = false;
               break;
            }
        }
        if(num[0]!='0'&&flag){
            String str= new String(num);
            System.out.println(str);
        }else{
            System.out.println(-1);
        }


    }
}
