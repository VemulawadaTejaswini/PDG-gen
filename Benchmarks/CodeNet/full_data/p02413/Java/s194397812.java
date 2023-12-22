import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] numbers = new int[r+1][c+1];
        
        for(int i = 0 ; i < r ; i++ ){
            for(int j = 0 ; j < c ; j++ ){
                numbers[i][j] = sc.nextInt();
                numbers[i][c] += numbers[i][j];
                numbers[r][j] += numbers[i][j];
                numbers[r][c] += numbers[i][j];
            }
        }
        
        for(int i = 0 ; i < r + 1 ; i++){
            for(int j = 0 ; j < c + 1 ; j++){
                if(j == 0){
                    System.out.print(numbers[i][j]);
                } else {
                    System.out.print(" " + numbers[i][j] );
                }
            }
            System.out.println();
        }
    }
}
