import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); int m = scan.nextInt();
        int [][] arr1 = new int[n+1][m+1];
          
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr1[i][j] = scan.nextInt();
            } 
        }
        
        for (int i = 0; i < n; i++) {
            int row = 0;
            for (int j = 0; j < m; j++) {
                row += arr1[i][j];
            }
            arr1[i][m] =row;
        }
        
        for (int i = 0; i < m +1; i++) {
            int column = 0;
            for (int j = 0; j < n; j++) {
                column += arr1[j][i];
            }
            arr1[n][i] =column;
            
        }
        
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                System.out.print(arr1[i][j]);
                if (j < m) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
