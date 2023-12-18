import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //kosuu
        int m = sc.nextInt(); //sourceCode
        int c = sc.nextInt(); //plus
        int b[] = new int[m];
        int a[][] = new int[n][m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                sum += a[i][j] * b[j];
            }
            if(sum+c>0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
