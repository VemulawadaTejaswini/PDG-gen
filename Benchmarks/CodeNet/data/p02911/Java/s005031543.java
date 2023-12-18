import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] point = new int[n];
        Arrays.fill(point, k);
        
        for(int i=0; i<q; i++){
            int a = sc.nextInt();
            for(int j=0; j<n; j++){
                if(j != a-1){
                    point[j]--;
                }
            }
        }
        
        for(int l=0; l<n; l++){
            System.out.println(point[l]>0?"Yes":"No");
        }
    }
}