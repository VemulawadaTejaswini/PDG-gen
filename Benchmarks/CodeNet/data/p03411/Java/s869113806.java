import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
      	int[][] red = new int[n][n];
        int[][] blue = new int[n][n];
      
      	for (int i = 0; i < n; i++) {
          red[i][0] = sc.nextInt();
          red[i][1] = sc.nextInt();
        }
      
        for (int i = 0; i < n; i++) {
          blue[i][0] = sc.nextInt();
          blue[i][1] = sc.nextInt();
        }
      	
        long ans = 0;
      	for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
              	if ((blue[i][0] > red[j][0]) && (blue[i][1] > red[j][1])){
                	ans++;
                	red[j][0] = 2 * n;
                	red[j][1] = 2 * n;
                	break;
              	}
			}
        }
        System.out.println(ans);
    }
    
}