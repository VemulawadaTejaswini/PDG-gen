import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] biscuits = new int[n];
        boolean isOdd = false;
        for(int i = 0; i < n; i++){
            biscuits[i] = sc.nextInt();
            if(biscuits[i] % 2 != 0){
                isOdd = true;
            }
        }
        if(isOdd){
            System.out.println((long)Math.pow(2,n-1));
        }else{
            System.out.println(p == 0 ? (long)Math.pow(2,n) : 0);
        }
        
    }
}
