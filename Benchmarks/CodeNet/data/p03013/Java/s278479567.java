import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        int[] a = new int [m];
        for(int i=0; i<m; i++){
            a[i] = stdIn.nextInt();
        }

        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;
        fibo[2] = 2;
        for(int i=3; i<fibo.length; i++){
            fibo[i] = fibo[i-2] + fibo[i-1];
        }

        if(a.length == 0){
            System.out.println(fibo[n]%=1000000007);
        }

        for(int i=0; i<a.length-1; i++){
            if(a[i+1]-a[i] == 1){
                System.out.println(0);
                return;
            }
        }

        long sum = 1;
        for(int i=0; i<a.length; i++){
            if(i == 0){
                if(a[i] == 1){
                    sum *= 1;
                }else{
                    sum *= fibo[a[i]-1];
                }
            }else{
                sum *= fibo[a[i]-a[i-1]-2];
            }
            if(sum >= 1000000007){
                sum %= 1000000007;
            }
        }
        sum *= fibo[n-a[m-1]-1];

        System.out.println(sum%=1000000007);
    }
}