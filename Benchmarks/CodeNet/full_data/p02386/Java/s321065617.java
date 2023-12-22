import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dice = new int[n][6];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 6; j++){
                dice[i][j] = sc.nextInt();
            }
        }
        String order = "RRRRNRRRRNRRRRNRRRRWRRRWWRRR";
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = 0; k < order.length(); k++){
                    char c = order.charAt(k);
                    int[] temp = new int[6];
                    if(c == 'R'){
                        temp[0] = dice[j][0];
                        temp[1] = dice[j][3];
                        temp[2] = dice[j][1];
                        temp[3] = dice[j][4];
                        temp[4] = dice[j][2];
                        temp[5] = dice[j][5];
                    }else if(c == 'W'){
                        temp[0] = dice[j][2];
                        temp[1] = dice[j][1];
                        temp[2] = dice[j][5];
                        temp[3] = dice[j][0];
                        temp[4] = dice[j][4];
                        temp[5] = dice[j][3];
                    }else if(c == 'N'){
                        temp[0] = dice[j][1];
                        temp[1] = dice[j][5];
                        temp[2] = dice[j][2];
                        temp[3] = dice[j][3];
                        temp[4] = dice[j][0];
                        temp[5] = dice[j][4];
                    }
                    dice[j] = temp;
                    if(dice[i][0] == dice[j][0] && dice[i][1] == dice[j][1] && dice[i][2] == dice[j][2] && dice[i][3] == dice[j][3] && dice[i][4] == dice[j][4] && dice[i][5] == dice[j][5]){
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}
