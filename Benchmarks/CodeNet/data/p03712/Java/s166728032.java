import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char paste[][] = new char[H+2][W+2];
        String line = "";
        for(int i = 0; i < H + 2; i++){
            for(int j = 0; j < W + 2; j++){
                paste[i][j] = ('#'); 
            }
        }
        for(int i = 1; i < H + 1; i++){
            line = sc.next();
            for(int j = 1; j < W + 1; j++){
                paste[i][j] = line.charAt(j-1); 
            }
        }
        for(int i = 0; i < H + 2; i++){
            for(int j = 0; j < W + 2; j++){
                System.out.print(paste[i][j]);
            }
            System.out.println("");
        }
	}
}