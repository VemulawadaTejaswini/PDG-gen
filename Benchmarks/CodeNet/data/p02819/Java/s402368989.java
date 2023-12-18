import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorization(n));
    }
    
    public static int factorization(int x) {
        List<Integer> prime = new ArrayList<>();
        if(x == 2) return 2;
        prime.add(2);
        for(int i = 3 ;; i+=2){
            boolean bool = true;
            for(int p: prime){
                if(i % p == 0){
                    bool = false;
                    break;
                }
            }
            if(bool){
                if(x <= i) return i;
                prime.add(i);
            }
        }
    }
}
