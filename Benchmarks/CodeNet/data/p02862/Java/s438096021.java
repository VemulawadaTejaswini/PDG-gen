import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A =0;
        if ((int)(X*(2/3.0)-Y/3.0)==(X*2/3-Y/3)){
           A = (X*2/3-Y/3);
        }else {
            System.out.println(0);
            System.exit(0);
        }
//        int N = factorial2((X+A)/2);
//        int a = factorial(A);
//        int b  =factorial((X-A)/2);
//        System.out.println(a+":"+b+":"+A+":"+X);
//        int result =(int)((N/(a*b))%(Math.pow(10,7)+7));
        int r = calcNumOfCombination((X+A)/2,A);
        int result =r%(int)(Math.pow(10,7)+7);

        System.out.println(result);

    }

    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int ans =1;
        for ( int i = 1; i <= n; i++ ) {
            ans = ans * i;
        }
        return ans;
    }
    static int factorial2(int n){
        if(n == 0){
            return 1;
        }
        int ans =1;
        for ( int i = 1; i <= n; i++ ) {
            ans = (ans * i)%((int)Math.pow(10,7)+7);
        }
        return ans;
    }
    static int calcNumOfCombination(int n, int r){
        int num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}
