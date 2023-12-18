import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] c = new int[3][3];
        int[][] c2 = new int[3][3];        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j] = sc.nextInt();
                c2[i][j] = c[i][j];
            }
        }

        for(int i=0; i<3; i++){
            c[i][2] -= c[i][0];
            c[i][1] -= c[i][0];
        }
        for(int i=0; i<2; i++){
            if(c[0][i+1] != c[1][i+1] || c[2][i+1] != c[1][i+1]){
                System.out.println("No");
                return;
            }
        }

        for(int i=0; i<3; i++){
            c2[2][i] -= c2[0][i];
            c2[1][i] -= c2[0][i];
        }
        for(int i=0; i<2; i++){
            if(c2[i+1][0] != c2[i+1][1] || c2[i+1][2] != c2[i+1][1]){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }   
}