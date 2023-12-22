import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int[][][] cube = new int[4][3][10];
        int b,f,r,v;
        for (int i = 0; i < n; i++){
            b = input.nextInt() - 1;
            f = input.nextInt() - 1;
            r = input.nextInt() - 1;
            v = input.nextInt();
            cube[b][f][r] += v;
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                for (int k = 0; k < 10; k++){
                    System.out.printf(" %d",cube[i][j][k]);
                }
                System.out.printf("\n");
            }
            if (i != 3){
                System.out.println("####################");
            }
        }
    }
}
