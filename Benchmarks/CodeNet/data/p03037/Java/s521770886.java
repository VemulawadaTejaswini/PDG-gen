import java.util.Scanner;
 
public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] pass = new int[m][n];
        
        for(int i = 0; i < m; i++) {
        	int l = sc.nextInt();
        	int r = sc.nextInt();
        	for(int j = l - 1; j < r; j++) {
        		pass[i][j]++;
        	}
        }
        int cnt = n;
        for(int j = 0; j < n; j++) {
        	for(int i = 0; i < m; i++) {
        		if(pass[i][j] == 0) {
        			cnt--;
        			break;
        		}
        	}
        }
        System.out.println(cnt);
    }
}