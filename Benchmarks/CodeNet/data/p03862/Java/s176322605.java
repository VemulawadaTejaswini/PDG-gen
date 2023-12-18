import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
	Scanner sc  = new Scanner(System.in);
        
    int cnt = 0;
 
	int  i1 = 0 ,i2 = 0, i3 = 0;
	long L1 = 0, L2 = 0, L3 = 0;
	char ch;
	String str = "";
		
    int ans = 0;
 
    int N = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int[] a  = new int[N+1];
    while(true){
        a[cnt] = Integer.parseInt(sc.next());
        cnt++;
        if(cnt==N)break;
    }
    
    for(int i=0;i<N;i++){
        if(a[i]+a[i+1]>x){
            
                int t = a[i] + a[i+1]-x;
                ans+=t;
                a[i+1] -= t;
    
        }
    }
 
        System.out.print(ans);
        System.out.println();
	}
        
}