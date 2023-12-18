import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        int g = A.get(0);
        for (int i = 1; i < N; i++) {
            g = gcd(g, A.get(i));
        }
        int maxa = Collections.max(A);
        if(K%g == 0 && maxa >= K){
            System.out.println("POSSIBLE");
        }else{
            System.out.println("IMPOSSIBLE");
        }
    }

    public static int gcd(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b=temp;
        }
        if(b ==0){
            return a;
        }
        a = a % b;
        return gcd(a,b);
    }
}