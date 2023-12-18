import java.util.Scanner;



class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();
        String [][] S = new String [H][W];
        final int height = H;
        final int width = W;
        int [][] number = new int [H][W];
        String[]tmp = new String[H];
       
        for (int i = 0; i < H ; i++){
            tmp[i] = sc.nextLine();
        }
            
        //set Tiles
        for (int i = 0; i < H ; i++){
            String[] str = tmp[i].split("");
            for (int j = 0; j <W ; j++){
                S[i][j] = str[j];
            }
        }

        //print mine number
        for (int i = 0; i < H ; i++){
            for(int j = 0; j < W; j ++){
                if( countMine(i , j, height, width, S ) == true){
                    continue;
                }else{
                    System.out.println("No");
                    System.exit(0);
                }
            }   
        }
        System.out.println("Yes");
        sc.close();
    }
    
    public static boolean countMine( int h, int w, int height, int width, String[][] S){
        boolean result = false;
        for (int i = h - 1; i <=  h + 1; i++){
            if( i < 0 || i >= height ){
                continue;
            }
            for (int j = w - 1; j <= w + 1; j++){

                if( j < 0 || j >= width){
                    continue;
                }
                if ( i + j == Math.abs(2) || i + j == 0 ){
                    continue;
                }
                if ( S[i][j].equals("#")){
                    result = true;
                }
            }
        }
        return result;
    }
}
