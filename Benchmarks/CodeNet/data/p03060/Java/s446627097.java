import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
        int[] v = new int[n];
        for(int i=0;i<n;i++) v[i]=sc.nextInt();
        int[] c = new int[n];
        for(int i=0;i<n;i++) c[i]=sc.nextInt();
        int ans=0;
        for(int i=0;i<(1<<n);i++){
            int x=0;
            int y=0;
            for(int j=0;j<n;j++){
                if((i>>j)%2==1){
                    x+=v[j];
                    y+=c[j];
                }
            }
            ans=Math.max(ans,x-y);
        }
        out.println(ans);
	}
}

// int n = sc.nextInt();
// int[] array = new int[n];
// String s = sc.next();
// s.charAt(i)
// out.println();
// Math.min()
