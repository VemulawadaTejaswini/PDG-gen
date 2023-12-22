import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a > b){
                int temp = a;
                a = b;
                b = temp;
            }
            int c = scan.nextInt();
            if(b > c){
                int temp = c;
                c = b;
                b = temp;
            }
            if(a * a + b * b == c * c){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

