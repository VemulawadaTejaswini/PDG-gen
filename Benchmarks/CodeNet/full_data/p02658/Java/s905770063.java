import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long res = 1;
        long sup = pow10(18);
        long num;
        for(int i = 0; i < n; i++){
            num = sc.nextLong();
            if(res == 0){
            } else if(num == 0){
                res = 0;
            } else if(res == -1){
            } else if(sup / res >= num){
                res = res * num;
            } else{
                res = -1;
            }
        }
        System.out.println(res);
        sc.close();
    }
    static long pow10(int n){
        long c = 1;
        for(int i = 0; i < n; i++){
            c *= 10;
        }
        return c;
    }
}