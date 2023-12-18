import java.util.Scanner;
public class Main {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = 0;
        int B = 0;
        
        int[][] arrayp = new int[66][66];
        for(int i = 0; i < 66 ; i++){
            for(int n = 0; n < 66; n++){
                arrayp[i][n] = i  * i  * i * i * i 
                        - n * n * n  * n  * n ;
            }
        }
        
        int[][] arrayn = new int[66][66];
        for(int i = 0; i < 66 ; i++){
            for(int n = 0; n < 66; n++){
                arrayn[i][n] = i  * i  * i * i * i 
                        + n * n * n  * n  * n ;
            }
        }
        
        for(int i = 0; i < 66 ; i++){
            for(int n = 0; n < 66; n++){
                if(X == arrayp[i][n]){
                    System.out.println(i + " " + n );
                    break;
                }
            }
        }
    
    }
}