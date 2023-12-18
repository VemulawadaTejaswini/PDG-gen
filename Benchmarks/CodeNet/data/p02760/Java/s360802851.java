import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      	int[][] matrix = new int[3][3];
		int[][] count = new int[3][3];
      
      	for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
            	matrix[i][j] = in.nextInt();  
            }
        }      
        int num = in.nextInt();
      	for (int m = 0; m < num; m++) {
			int n = in.nextInt();
          	for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  if (matrix[i][j] == n) count[i][j]++;  
              }
        	}
        }
        
      	boolean exist = false;
      
      	if (count[0][0] == 1 && count[1][1] == 1 && count[2][2] == 1) 
			exist = true;
        if (count[0][2] == 1 && count[1][1] == 1 && count[2][0] == 1) 
			exist = true;
      	if (count[0][0] == 1 && count[0][1] == 1 && count[0][2] == 1) 
			exist = true;
      	if (count[1][0] == 1 && count[1][1] == 1 && count[1][2] == 1) 
			exist = true;     
      	if (count[2][0] == 1 && count[2][1] == 1 && count[2][2] == 1) 
			exist = true;     
      	if (count[0][0] == 1 && count[1][0] == 1 && count[2][0] == 1) 
			exist = true;
      	if (count[0][1] == 1 && count[1][1] == 1 && count[2][1] == 1) 
			exist = true;     
      	if (count[0][2] == 1 && count[1][2] == 1 && count[2][2] == 1) 
			exist = true;
      	System.out.println(exist ? "Yes" : "No");
 
    }
 
}