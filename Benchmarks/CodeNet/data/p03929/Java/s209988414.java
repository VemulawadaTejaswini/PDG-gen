import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
	Scanner sc  = new Scanner(System.in);
        
    int cnt = 0;
    int ans = 0;
    
    int n = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    
    int[][] c = new int[n+2][8];

    
    for(int i=0;i<n;i++){for(int k=0;k<7;k++){cnt++;c[i][k] = cnt;}}
    
    
    for(int i=0;i<n-2;i++){
        for(int k=0;k<5;k++){
            int  F = c[i][k]   +c[i][k+1] +c[i][k+2] 
                    +c[i+1][k] +c[i+1][k+1] +c[i+1][k+2] 
                    +c[i+2][k] +c[i+2][k+1] +c[i+2][k+2] ;
            //         System.out.println(F%11);
            if(F%11==d)ans++;
        }
    }
    
    
    
    
    //Map debag
  //  for(int i=0;i<n;i++){for(int k=0;k<7;k++){System.out.print(c[i][k]+"   ");}System.out.println();}

        System.out.print(ans);
        System.out.println();
	}
        
}