mport java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Dice dice = new Dice(sc, x);
        if(check(dice)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
    
    public static boolean check(Dice dice) {
        char[] pat = {'N','N','E','E','E','N'};
        for(int j = 0; j < dice.data.length; j++){
            for(int k = 0; k < dice.data[j].length; k++){
                if(j == k){ break; }
                for(char p:pat){
                    if(Arrays.equals(dice.data[j], dice.data[k])){
                        return true;
                    }
                    dice.roll(0, p);
                    for(int i = 0; i < 4; i++){
                        if(Arrays.equals(dice.data[j], dice.data[k])){
                            return true;
                        }
                        dice.roll(0, 'Z');
                    }
                }
            }
        }
        return false;
    }
}

class Dice {
    static int[][] data;

    public Dice(Scanner sc, int x){
        data = new int[x][6];
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
            data[i][j] = sc.nextInt();
            }
        }
    }

    public static void roll(int n, char p) {
        int temp = data[n][0];
        switch(p){
            case 'E':
                data[n][0] = data[n][2];
                data[n][2] = data[n][5];
                data[n][5] = data[n][3];
                data[n][3] = temp; break;
            case 'W':
                data[n][0] = data[n][3];
                data[n][3] = data[n][5];
                data[n][5] = data[n][2];
                data[n][2] = temp; break;
            case 'S':
                data[n][0] = data[n][1];
                data[n][1] = data[n][5];
                data[n][5] = data[n][4];
                data[n][4] = temp; break;
            case 'N':
                data[n][0] = data[n][4];
                data[n][4] = data[n][5];
                data[n][5] = data[n][1];
                data[n][1] = temp; break;
            case 'Z':
                temp = data[n][1];
                data[n][1] = data[n][2];
                data[n][2] = data[n][4];
                data[n][4] = data[n][3];
                data[n][3] = temp; break;
            default:
        }
    }
}