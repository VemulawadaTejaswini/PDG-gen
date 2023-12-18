import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String [][] S = new String [H][W];
        final int height = H;
        final int width = W;
        int [][] number = new int [H][W];
        String[]tmp = new String[H];

        for (int i = 0; i < H ; i++){
            tmp[i] = sc.next();
        }
            
        //set Tiles
        for (int i = 0; i < H ; i++){
            for (int j = 0; j <W ; j++){
                String[] str = tmp[i].split("");
                S[i][j] = str[i];
            }
        }
        //print mine number
        for (int i = 0; i < H ; i++){
            for(int j = 0; j < W; j ++){
                number[i][j] = countMine(i , j, height, width, S );
                if( S[i][j].equals("#") ){
                    System.out.print("#");    
                }else{
                    System.out.print(number[i][j]);
                }
            }
            System.out.println();
        }
    }
    
    public static int countMine( int h, int w, int height, int width, String[][] S){
        int count = 0;
        for (int i = h - 1; i <=  h + 1; i++){
            if( i < 0 || i >= height ){
                continue;
            }
            for (int j = w - 1; j <= w + 1; j++){

                if( j < 0 || j >= width){
                    continue;
                }
                if ( S[i][j].equals("#")){
                   count++;
               }
            }
        }
        return count;
    }
}