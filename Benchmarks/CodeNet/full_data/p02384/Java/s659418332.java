import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[6];
        for (int i = 0; i < 6; i++){
            num[i] = input.nextInt();
        }
        Dice dice = new Dice(num);
        int q,top,front;
        int a = 0;
        int b = 0;
        q = input.nextInt();
        for (int i = 0; i < q; i++){
            top = input.nextInt();
            front = input.nextInt();
            for (int j = 0; j < 6; j++){
                if (num[j] == top){
                    a = j;
                } else if (num[j] == front){
                    b = j;
                }
            }
            if ((a == 3 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 4) || (a == 4 && b == 3)){
                dice.disp_num(0);
            } else if ((a == 2 && b == 0) || (a == 5 && b == 2) || (a == 3 && b == 5) || (a == 0 && b == 3)){
                dice.disp_num(1);
            } else if ((a == 0 && b == 1) || (a == 1 && b == 5) || (a == 5 && b == 4) || (a == 4 && b == 0)){
                dice.disp_num(2);
            } else if ((a == 1 && b == 0) || (a == 5 && b == 1) || (a == 4 && b == 5) || (a == 0 && b == 4)){
                dice.disp_num(3);
            } else if ((a == 0 && b == 2) || (a == 2 && b == 5) || (a == 5 && b == 3) || (a == 3 && b == 0)){
                dice.disp_num(4);
            } else{
                dice.disp_num(5);
            }
        }
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
    public void disp_num(int n){
        System.out.println(dice_num[n]);
    }
}
