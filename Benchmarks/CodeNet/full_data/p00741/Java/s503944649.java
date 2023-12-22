import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();

        while(h != 0 || w != 0) {
            int[][] island = new int[h + 2][w + 2];

            for(int i = 0; i <= h + 1; i++) {
                island[i][0] = 0;
                island[i][w + 1] = 0;
            }
            for(int i = 1; i <= w; i++){
                island[0][i] = 0;
                island[h + 1][i] = 0;
            }

            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++)
                    island[i][j] = sc.nextInt();
            }

            System.out.println(countIsland(island, h, w));

            w = sc.nextInt();
            h = sc.nextInt();
        }
        sc.close();
    }

    private static int countIsland(int[][] island, int h, int w){
        int index = 2;
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= w; j++){
                if(island[i][j] == 1){
                    island[i][j] = index++;
                    if(island[i - 1][j - 1] == 1)
                        island[i - 1][j - 1] = island[i][j];
                    if(island[i - 1][j + 1] == 1)
                        island[i - 1][j + 1] = island[i][j];
                    if(island[i + 1][j - 1] == 1)
                        island[i + 1][j - 1] = island[i][j];
                    if(island[i + 1][j + 1] == 1)
                        island[i + 1][j + 1] = island[i][j];
                    if(island[i][j + 1] == 1)
                        island[i][j + 1] = island[i][j];
                    if(island[i][j - 1] == 1)
                        island[i][j - 1] = island[i][j];
                    if(island[i + 1][j] == 1)
                        island[i + 1][j] = island[i][j];
                    if(island[i - 1][j] == 1)
                        island[i - 1][j] = island[i][j];
                }
            }
        }

        int flag = 0;
        while(flag == 0){
            flag = 1;
            for(int i = 1; i <= h; i++){
                for(int j = 1; j <= w; j++){
                    if(island[i][j] != 0){
                        if(island[i][j] < island[i - 1][j - 1]) {
                            flag = 0;
                            island[i - 1][j - 1] = island[i][j];
                        }
                        if(island[i][j] > island[i - 1][j - 1] && island[i - 1][j - 1] != 0) {
                            flag = 0;
                            island[i][j] = island[i - 1][j - 1];
                        }
                        if(island[i][j] < island[i - 1][j + 1]) {
                            flag = 0;
                            island[i - 1][j + 1] = island[i][j];
                        }
                        if(island[i][j] > island[i - 1][j + 1] && island[i - 1][j + 1] != 0) {
                            flag = 0;
                            island[i][j] = island[i - 1][j + 1];
                        }
                        if(island[i][j] < island[i + 1][j - 1]) {
                            flag = 0;
                            island[i + 1][j - 1] = island[i][j];
                        }
                        if(island[i][j] > island[i + 1][j - 1] && island[i + 1][j - 1] != 0) {
                            flag = 0;
                            island[i][j] = island[i + 1][j - 1];
                        }
                        if(island[i][j] < island[i + 1][j + 1]) {
                            flag = 0;
                            island[i + 1][j + 1] = island[i][j];
                        }
                        if(island[i][j] > island[i + 1][j + 1] && island[i + 1][j + 1] != 0) {
                            flag = 0;
                            island[i][j] = island[i + 1][j + 1];
                        }
                        if(island[i][j] < island[i][j + 1]) {
                            flag = 0;
                            island[i][j + 1] = island[i][j];
                        }
                        if(island[i][j] > island[i][j + 1] && island[i][j + 1] != 0) {
                            flag = 0;
                            island[i][j] = island[i][j + 1];
                        }
                        if(island[i][j] < island[i][j - 1]) {
                            flag = 0;
                            island[i][j - 1] = island[i][j];
                        }
                        if(island[i][j] > island[i][j - 1] && island[i][j - 1] != 0) {
                            flag = 0;
                            island[i][j] = island[i][j - 1];
                        }
                        if(island[i][j] < island[i + 1][j]) {
                            flag = 0;
                            island[i + 1][j] = island[i][j];
                        }
                        if(island[i][j] > island[i + 1][j] && island[i + 1][j] != 0) {
                            flag = 0;
                            island[i][j] = island[i + 1][j];
                        }
                        if(island[i][j] < island[i - 1][j]) {
                            flag = 0;
                            island[i - 1][j] = island[i][j];
                        }
                        if(island[i][j] > island[i - 1][j] && island[i - 1][j] != 0) {
                            flag = 0;
                            island[i][j] = island[i - 1][j];
                        }
                    }
                }
            }
        }

        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= w; j++){
                if(island[i][j] != 0){
                    for(int k = 1; k <= h; k++){
                        for(int l = 1; l <= w; l++){
                            if(island[k][l] == island[i][j] && (k != i || l != j))
                                island[k][l] = 0;
                        }
                    }
                }
            }
        }

        int count = 0;

        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= w; j++){
                if(island[i][j] != 0)
                    count++;
            }
        }

        return count;
    }
}
