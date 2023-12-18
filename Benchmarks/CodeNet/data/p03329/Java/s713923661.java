import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ret = 999999;
        for(int i = 0; i <= n ; i++ ){
            int c = 0;
            int a = i;
            while(a > 0){
                c += a % 9;
                a = a / 9;
            }
            a = n - i;
            while(a > 0){
                c += a % 6;
                a = a / 6;
            }
            if(ret > c){
                ret = c;
            }
        }
        System.out.println(ret);

    }
}