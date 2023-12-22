import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] table = new int[r+1][c+1];
        for(int i = 0; i < r; i++){
            int sum = 0;
            for(int j = 0; j < c; j++){
                table[i][j] = scanner.nextInt();
                sum += table[i][j];
            }
            table[i][c] = sum;
        }
        for(int i = 0; i < c+1; i++){
            int sum = 0;
            for(int j = 0; j < r; j++){
                sum += table[j][i];
            }
            table[r][i] = sum;
        }

        for(int i = 0; i < r+1; i++){
            for(int j = 0; j < c+1; j++){
                if(j != c)System.out.print(table[i][j]+" ");
                else System.out.println(table[i][j]);
            }
        }

    }
}

