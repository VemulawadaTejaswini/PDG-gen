import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A % 2 == 1 && B % 2 == 1){
            System.out.println("Alice");
            return;
        }
        if(A % 2 == 0 && B % 2 == 0){
            System.out.println("Alice");
            return;
        }
        System.out.println("Borys");
    }
}
