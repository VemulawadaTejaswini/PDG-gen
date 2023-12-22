import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][][] build = new int[4][3][10];
        do{
            int b = scanner.nextInt();
            int f = scanner.nextInt();
            int r = scanner.nextInt();
            int v = scanner.nextInt();
            build[b-1][f-1][r-1] += v;
        }while(1 < n--);
        
        int i =0;
        for(int[][] b : build){
            for(int[] f : b){
                for(int r : f){
                    System.out.print(" " + r);
                }
                System.out.println("");
            }
            i++;
            if(i < 4){
               System.out.println("####################"); 
            }
        }
    }
}
