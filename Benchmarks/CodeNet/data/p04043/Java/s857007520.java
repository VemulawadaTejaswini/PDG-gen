import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        int A = sn.nextInt();
        int B = sn.nextInt();
        int C = sn.nextInt();

        int sum = A + B + C;
        if(sum == 17){
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}