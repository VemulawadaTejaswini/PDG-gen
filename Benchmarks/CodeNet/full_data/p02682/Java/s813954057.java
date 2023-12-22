import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        if(a>=k) {
            sum = k;
            k=0;
        }else{
            sum = a;
            k -= a;
        }
        if(b>=k){
            k -= k;
        }else{
            k-=b;
        }
        if(k>0){
            sum -= k;
        }
        System.out.println(sum);
    }
}