import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = adjust(sc.nextInt());
        int B = adjust(sc.nextInt());
        if(A==B){
            System.out.println("Draw");
        }else if(A>B){
            System.out.println("Alice");
        }else{
            System.out.println("Bob");
        }
    }
    static int adjust(int N){
        if(N==1)N+=13;
        return N;
    }
}
