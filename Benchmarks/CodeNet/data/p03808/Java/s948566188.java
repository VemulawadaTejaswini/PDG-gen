import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        BitSet[] b = new BitSet[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            b[i] = new BitSet(n+1);
            //b[i].set(1);
        }
        
        int c = (int)Math.ceil(Math.sqrt(n));
        
        for(int i=0; i<n; i++){
            for(int j=1; j<=c; j++){
                if(a[i]%j==0){
                    b[(n+i-j)%n].set(j-1);
                    if(a[i]/j<=n){
                        b[(n+i-a[i]/j)%n].set(a[i]/j-1);
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++){
            b[i].flip(0, n);
            if(b[i].isEmpty()){
                System.out.println("YES");
                return;
            }
        }
        
        System.out.println("NO");
    }
}
