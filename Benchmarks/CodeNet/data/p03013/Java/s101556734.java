import java.util.*;

public class Main {


    public static int fibo(int num){
        if (num==0) return 0;
        if (num==1) return 1;
        return fibo(num-1) + fibo(num-2);
    }



    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];

        int sum = 0;

        for (int i=0; i<m; i++){
            a[i] = sc.nextInt();
        }


        for (int j=0; j<m; j++){

            sum = fibo(a[j]-1)*fibo(a[j+1]-a[j]-1);
        }

        System.out.print(sum);

        }

    }



