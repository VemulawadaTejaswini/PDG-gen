import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();

        int sum = 0;

        if(a>=k){
            System.out.println(k);
        }
        else{
            sum = a;
            k = k-a;
            if(b>=k) {
                System.out.println(sum);
            }
            else{
                k = k-b;
                if(c>=k){
                    System.out.println(sum-k);}
            }
        }

    }
}