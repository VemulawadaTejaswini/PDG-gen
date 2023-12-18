import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int[]b = new int[m];
    int[][]a = new int[n][m];
    
    int cou = 0;
    for(int i=0; i<m; i++) {
    	b[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++) {
    for(int j=0; j<m; j++) {
    	a[i][j] = sc.nextInt();
    }
    }
    int ans = 0;
    for(int i=0; i<n; i++) {
    	int all = 0;
    	for(int j=0; j<m; j++) {
      			all += a[i][j]*b[j];
    	}
    	
    	if(all+c > 0) {
   			ans++;
   	    	}
    }
    	System.out.println(ans);
    }
}

