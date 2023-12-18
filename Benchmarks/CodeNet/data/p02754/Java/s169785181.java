import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        if(A+B==N){
            System.out.println(A);
        }else{
            System.out.println(A+(N-(A+B)));
        }
    }
}