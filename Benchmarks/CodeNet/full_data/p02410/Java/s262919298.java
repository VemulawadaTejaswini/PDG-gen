import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int cow = input.nextInt();
        int[][] A = new int[row][cow];
        int[] b = new int[cow];
        for(int i = 0; i < row; i ++)
            for(int j = 0; j < cow; j ++)
                A[i][j] = input.nextInt();
        for(int k = 0; k < cow; k ++)
            b[k] = input.nextInt();
        calculate(A, b);    
    }
    
    public static void calculate(int[][] A, int[] b){
        int sum = 0;
        for(int i = 0; i < A.length; i ++){
            for(int j = 0; j < A[0].length; j ++)
                sum += (A[i][j] * b[j]);
            System.out.println(sum);
            sum = 0;
        }
    }
}
