import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int K = s.nextInt();
        int A = s.nextInt();
        int B = s.nextInt();

        if(check(K, A, B))
            System.out.println("OK");
        else
            System.out.println("NG");


    }
    public static boolean check(int K, int A, int B) {
        for(int i=A; i<=B; i++){
            if(i%K==0)
                return true;
        }
        return false;
    }


}
