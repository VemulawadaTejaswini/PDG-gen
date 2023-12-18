import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P[] = new int[N];
        int A[] = new int[N+1];
        
        for(int i = 0; i < N; i++){
            P[i] = sc.nextInt();
            A[P[i]] = i + 1;
        }
        
        TreeSet<Integer> Piterator = new TreeSet<>();
        Piterator.add(0);
        Piterator.add(N+1);
        
        long S = 0;
        
        for(int i = N; i >= 1; i--){
            int Xi = A[i];
            
            int y = Piterator.higher(Xi);
            int z = N + 1;
            if( y != N +1) {
                z = Piterator.higher((int)y);
            }
            
            int x = Piterator.lower(Xi);
            int w = 0;
            if(x != 0) {
                w = Piterator.lower((int)x);
            }
            
            long Ci = (x - w) * (y - Xi) + (Xi - x) * (z - y);
            S += Ci * i;
            Piterator.add(Xi);
        }
        System.out.println(S);
    }
}
