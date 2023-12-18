import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if(N<=K) System.out.println(1);
        else if(N%(K-1)==0) System.out.println(N/(K-1));
        else System.out.println(N/(K-1)+1);
    }
}