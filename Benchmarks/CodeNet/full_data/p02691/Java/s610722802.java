import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    int[] A = new int[n];
    int count = 0;
    for(int i = 0; i < n; i++){
        A[i] = sc.nextInt();
        
    }

    for(int i = 0; i < n-1; i++){
        for(int j = i+1; j < n; j++){
            if(j - i == (A[i]+A[j])){
                
                count++;
            }
        }
    }
    System.out.println(count);
    }
}
