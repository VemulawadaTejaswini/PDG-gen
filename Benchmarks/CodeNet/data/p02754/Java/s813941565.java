import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = N/(A+B);
        int y = N%(A+B);
        if(y <= A){
            System.out.println(x*A + y);
        }else{
            System.out.println(x*A + A);
        }
    }
}