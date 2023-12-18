import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int m = scn.nextInt();
		int[] a = new int[m];
      	int[] b = new int[m];
		for(int i=0; i<m; i++){
			a[i] = scn.nextInt();
          	b[i] = scn.nextInt();
		}
      	String ans = "IMPOSSIBLE";
      	for(int i=0; i<m; i++){
          if(a[i]==1){
          	for(int j=0; j<m; j++){
              if(b[i]==a[j] && b[j]==n) ans = "POSSIBLE";
            }
          }
        }
      	System.out.println(ans);
	}
}
