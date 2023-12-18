import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
      
      	int data[][] = new int[m][2];
      	for (int i = 0; i < m; i++) {
          data[i][0] = sc.nextInt();
          data[i][1] = sc.nextInt();
        }
      
      	int judge = 0;
      	int count = 0;
      
      	for (int i = 1; i <= n; i++) {
          judge = 0;
          for (int j = 0; j < m; j++) {
            if (i < data[j][0] || data[j][1] < i) {
              judge++;
            }
            
          }
          
          if (judge == 0) {
            count++;
          }
        }
      	
      	System.out.println(count);
    }
}