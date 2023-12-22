import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next()); 
        int m = Integer.parseInt(scan.next());

        int[][] matrix = new int[n][m];
        int[] vector = new int[m];
        int[] dot = new int[n];

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = Integer.parseInt(scan.next());
            }
        }

        for (int i=0; i<m; i++)
            vector[i] = Integer.parseInt(scan.next());

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                dot[i] += matrix[i][j] * vector[j];
            }
        }

        for (int ele: dot){
            System.out.println(ele);
        }
    }
}