import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int c = (int)Math.sqrt(n)+1;
        boolean[] used = new boolean[n+1];
        
        for(int i=0; i<n; i++){
            Arrays.fill(used, false);
            for(int j=1; j<=c; j++){
                if(a[i]%j==0){
                    if(!used[j]){
                        b[(n+i-j)%n]++;
                        used[j] = true;
                    }
                    if(a[i]/j<=n && !used[a[i]/j]){
                        b[(n+i-a[i]/j)%n]++;
                        used[a[i]/j] = true;
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++){
            if(b[i]==n){
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
    }
}
