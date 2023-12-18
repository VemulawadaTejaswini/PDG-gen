import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] v = new int[n];
        
        for(int i = 0; i<n; i++){
            v[i] = sc.nextInt();
        }
        
        for(int i = 0; i< n-1; i++){
            if(v[i] < 0){
                v[i] *= -1;
                v[i+1] *= -1;
            }
        }
        
        int sum = 0;
        
        for(int i : v){
            sum += i;
        }
        
        System.out.println(sum);
        
    }
}
