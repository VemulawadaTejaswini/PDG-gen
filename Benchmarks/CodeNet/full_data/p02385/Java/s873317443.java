import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice(sc);
        if(check(dice)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
    public static boolean check(Dice dice) {
        char[] pat = {'N','N','E','E','E','N'};
        for(char p:pat){
            if(Arrays.equals(dice.data[0], dice.data[1])){
                return true;
            }
            dice.roll(0, p);
            for(int i = 0; i < 4; i++){
                if(Arrays.equals(dice.data[0], dice.data[1])){
                    return true;
                }
                dice.roll(0, 'Z');
            }
        }
        return false;
    }
}

class Dice {
    static int[][] data;

    public Dice(Scanner sc){
        data = new int[2][6];
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