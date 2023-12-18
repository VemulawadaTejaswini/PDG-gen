import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] N = sc.next().split("");
        if ((N[0] == N[1] && N[1] == N[2]) || (N[2] == N[3] && N[1] == N[2])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }   
}
