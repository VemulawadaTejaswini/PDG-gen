import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        Dice[] dices = new Dice[n];
        int[] num = new int[6];
        Dice tmp;
        String ans = "Yes";
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 6; j++){
                num[j] = input.nextInt();
            }
            tmp = new Dice(num);
            dices[i] = tmp;
        }
        boolean flag = false;
        String rolling = "EEENEEENEEESEEESEEENEEEN";
        for (int i = 0; i < (n-1); i++){
            if (flag) {
                break;
            }
            for (int j = (i+1); j < n; j++){
                if (dices[i].isSame(dices[j])){
                    ans = "No";
                    flag = true;
                    break;
                }
                for (int k = 0; k < rolling.length(); k++){
                    char c = rolling.charAt(k);
                    dices[j].roll(c);
                    if (dices[i].isSame(dices[j])){
                        ans = "No";
                        flag = true;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

class Dice {
    private int N,E,W,S,T,B;
    private int[] dice_num;
    Dice(int[] num_array){
        dice_num = num_array;
        T = dice_num[0];
        S = dice_num[1];
        E = dice_num[2];
        W = dice_num[3];
        N = dice_num[4];
        B = dice_num[5];
    }
    public void roll(char direction){
        int tmp;
        if (direction == 'N'){
            tmp = T;
            T = S;
            S = B;
            B = N;
            N = tmp;
        } else if (direction == 'E'){
            tmp = T;
            T = W;
            W = B;
            B = E;
            E = tmp;
        } else if (direction == 'W'){
            tmp = T;
            T = E;
            E = B;
            B = W;
            W = tmp;
        } else {
            tmp = T;
            T = N;
            N = B;
            B = S;
            S = tmp;
        }
    }
    public void disp_top(){
        System.out.println(T);
    }
    public boolean isSame(Dice dice){
        if (T == dice.T &&
            S == dice.S &&
            E == dice.E &&
            W == dice.W &&
            N == dice.N &&
            B == dice.B){
                return true;
            } else {
                return false;
            }
    }
}
