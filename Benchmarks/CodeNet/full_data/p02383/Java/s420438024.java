import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice(sc);
        String[] point = sc.next().split("");
        for(String p:point){
            switch(p){
                case "E": dice.east(); break;
                case "W": dice.west(); break;
                case "S": dice.south(); break;
                case "N": dice.north(); break;
            }
        }
        System.out.println(dice.dice.get(0));
    }
}

class Dice{
    // dice<0>?????¢ <1>?????¢ <2>??±??¢ <3>?\???¢ <4>?????¢ <5>?????¢
    static ArrayList<String> dice = new ArrayList<String>();
    static int[] east = {2,5,3,0};
    static int[] west = {3,5,2,0};
    static int[] south = {1,5,4,0};
    static int[] north = {4,5,1,0};
    static String g;
    
    public Dice(Scanner sc){
        for(int i = 0; i < 6; i++){
            dice.add(sc.next());
        }
    }
    public static void east(){
        g = dice.get(0);
        for(int i:east){
            g = dice.set(i,g);
        }
    }
    public static void west(){
        g = dice.get(0);
        for(int i:west){
            g = dice.set(i,g);
        }
    }
    public static void south(){
        g = dice.get(0);
        for(int i:south){
            g = dice.set(i,g);
        }
    }
    public static void north(){
        g = dice.get(0);
        for(int i:north){
            g = dice.set(i,g);
        }
    }
}