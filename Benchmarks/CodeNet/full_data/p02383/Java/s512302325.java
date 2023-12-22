import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice(sc);
        String[] point = sc.next().split("");
        for(String p:point){
            dice.roll(p);
        }
        System.out.println(dice.dice.get(0));
    }
}

class Dice{
    static ArrayList<String> dice = new ArrayList<>();
    static final int[] EAST = {2,5,3,0};
    static final int[] WEST = {3,5,2,0};
    static final int[] SOUTH = {1,5,4,0};
    static final int[] NORTH = {4,5,1,0};
    static String g;
    
    public Dice(Scanner sc){
        for(int i = 0; i < 6; i++){
            dice.add(sc.next());
        }
    }
    public static void roll(String point){
        g = dice.get(0);
        switch(point){
            case "E":
                for(int i:EAST){
                    g = dice.set(i,g);
                } break;
            case "W":
                for(int i:WEST){
                    g = dice.set(i,g);
                } break;
            case "S":
                for(int i:SOUTH){
                    g = dice.set(i,g);
                } break;
            case "N":
                for(int i:NORTH){
                    g = dice.set(i,g);
                } break;
        }
    }
}