import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int[][] a = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                a[i][j] = scanner.nextInt()%2;
            }
        }
        ArrayList<int[]> move = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W-1; j++) {
                if(a[i][j]==1){
                    a[i][j+1] = (a[i][j+1] + 1)%2;
                    move.add(new int[]{i,j,i,j+1});
                }
            }
        }
        for (int i = 0; i < H-1; i++) {
            if(a[i][W-1] == 1){
                a[i+1][W-1] = (a[i+1][W-1]+1)%2;
                move.add(new int[]{i,W-1, i+1,W-1});
            }
        }
        System.out.println(move.size());
        for (int i = 0; i < move.size(); i++) {
            System.out.println(
                String.format("%d %d %d %d",
                    move.get(i)[0] +1,
                    move.get(i)[1] +1,
                    move.get(i)[2] +1,
                    move.get(i)[3] +1));
        }
    }
}