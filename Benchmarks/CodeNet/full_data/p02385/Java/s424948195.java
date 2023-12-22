import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] dice1 = new int[6];
        int[] dice2 = new int[6];
        for(int i = 0; i < 6; i++){
            dice1[i] = sc.nextInt();
        }
        for(int i = 0; i < 6; i++){
            dice2[i] = sc.nextInt();
        }
        String order = "RRRRNRRRRNRRRRNRRRRWRRRWWRRR";
        for(int i = 0; i < order.length(); i++){
            char c = order.charAt(i);
            int[] temp = new int[6];
            if(c == 'R'){
                temp[0] = dice2[0];
                temp[1] = dice2[3];
                temp[2] = dice2[1];
                temp[3] = dice2[4];
                temp[4] = dice2[2];
                temp[5] = dice2[5];
            }else if(c == 'W'){
                temp[0] = dice2[2];
                temp[1] = dice2[1];
                temp[2] = dice2[5];
                temp[3] = dice2[0];
                temp[4] = dice2[4];
                temp[5] = dice2[3];
            }else if(c == 'N'){
                temp[0] = dice2[1];
                temp[1] = dice2[5];
                temp[2] = dice2[2];
                temp[3] = dice2[3];
                temp[4] = dice2[0];
                temp[5] = dice2[4];
            }
            dice2 = temp;
            if(dice1[0] == dice2[0] && dice1[1] == dice2[1] && dice1[2] == dice2[2] && dice1[3] == dice2[3] && dice1[4] == dice2[4] && dice1[5] == dice2[5]){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
