import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice(sc);
        int x = sc.nextInt();
        for(int i = 0; i < x; i++){
            int up = sc.nextInt();
            int front = sc.nextInt();
            for(int j = 0; j < 2; j++){
                if(dice.dice.get(0) == up){
                    break;
                }
                for(int k = 0; k < 3; k++){
                    if(dice.dice.get(0) == up){
                        break;
                    }else if(j == 0){
                        dice.roll('N');
                    }else{
                        dice.roll('W');
                    }
                }
            }
            while(dice.dice.get(1) != front){
                dice.zroll();
            }
            System.out.println(dice.dice.get(2));
        }
    }
}

class Dice{
    // dice<> 0??? 1??? 2??± 3?\? 4??? 5???
    static ArrayList<Integer> dice = new ArrayList<>();
    static final int[] EAST = {2,5,3,0};
    static final int[] WEST = {3,5,2,0};
    static final int[] SOUTH = {1,5,4,0};
    static final int[] NORTH = {4,5,1,0};
    static final int[] Z = {2,4,3,1};
    static Integer g;
    
    public Dice(Scanner sc){
        for(int i = 0; i < 6; i++){
            dice.add(sc.nextInt());
        }
    }
    public static void roll(char point){
        g = dice.get(0);
        switch(point){
            case 'E':
                for(int i:EAST){
                    g = dice.set(i,g);
                } break;
            case 'W':
                for(int i:WEST){
                    g = dice.set(i,g);
                } break;
            case 'S':
                for(int i:SOUTH){
                    g = dice.set(i,g);
                } break;
            case 'N':
                for(int i:NORTH){
                    g = dice.set(i,g);
                } break;
            default:
        }
    }
    public static void zroll(){
        g = dice.get(1);
        for(int i:Z){
            g = dice.set(i,g);
        }
    }
}