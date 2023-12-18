import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int total = 0;
        int [] votes = new int[n];
        for(int i = 0; i<n; i++){
            votes[i] = sc.nextInt();
            total += votes[i];
        }
        Arrays.sort(votes);
      double threshold = (1/(4*m)) * total;        
      for(int i = votes.length-1; i>=n-m; i--){
            if(votes[i]<threshold) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
