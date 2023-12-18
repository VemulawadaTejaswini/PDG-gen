import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            int count = 0;
            int[] v = new int[n];
            
            v[0] = in.nextInt();
            v[1] = in.nextInt();
            int a = v[0];
            boolean flag = a != v[1];
            for (int i = 2; i < n; i++) {
               v[i] = in.nextInt();
               if(v[i] != v[i - 2]){
                   count ++;
               }

               flag = (a != v[i]) || flag;
            }
            if(flag){
                System.out.println(count);
            }else{
                System.out.println(n / 2);

            }
        }
    }
}