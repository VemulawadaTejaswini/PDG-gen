import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> dice1 = new ArrayList<>();
    static ArrayList<Integer> dice2 = new ArrayList<>();
    static final int[] EAST = {2,5,3,0};
    static final int[] WEST = {3,5,2,0};
    static final int[] SOUTH = {1,5,4,0};
    static final int[] NORTH = {4,5,1,0};
    static final int[] ZROLL = {2,4,3,1};
    static final char[] cha = {'N','E','E','E','N'};
    static Integer g;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            dice1.add(sc.nextInt());
        }
        for(int i = 0; i < 6; i++){
            dice2.add(sc.nextInt());
        }
        for(char p:cha){
            if(dice1.get(0) == dice2.get(0)){
                break;
            }
            roll(p);
        }
        while(dice1.get(1) != dice2.get(1)){
            roll('Z');
        }
        if(dice1.get(2) == dice2.get(2) && dice1.get(3) == dice2.get(3) && dice1.get(4) == dice2.get(4)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void roll(char point){
        if(point == 'Z'){
        g = dice1.get(1);
        }else{
        g = dice1.get(0);
        }
        switch(point){
            case 'E':
                for(int i:EAST){
                    g = dice1.set(i,g);
                } break;
            case 'W':
                for(int i:WEST){
                    g = dice1.set(i,g);
                } break;
            case 'S':
                for(int i:SOUTH){
                    g = dice1.set(i,g);
                } break;
            case 'N':
                for(int i:NORTH){
                    g = dice1.set(i,g);
                } break;
            case 'Z':
                for(int i:ZROLL){
                    g = dice1.set(i,g);
                } break;
            default:
        }
    }
}