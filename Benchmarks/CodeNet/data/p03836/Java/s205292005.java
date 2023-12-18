import java.util.*;
import java.io.*;

public class Main {
    public static void up(){
        System.out.print("U");
    }
    public static void down(){
        System.out.print("D");
    }
    public static void left(){
        System.out.print("L");
    }
    public static void right(){
        System.out.print("R");
    }
    
    public static void up(int N){
        for(int n=0;n<N;n++)up();
    }
    public static void down(int N){
        for(int n=0;n<N;n++)down();
    }
    public static void left(int N){
        for(int n=0;n<N;n++)left();
    }
    public static void right(int N){
        for(int n=0;n<N;n++)right();
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        
        int dx = tx-sx;
        int dy = ty-sy;
        
        left();
        up(dy+1);
        right(dx+1);
        down();
        
        left(dx);
        down(dy);
        
        right(dx);
        up(dy);
        
        right();
        down(dy+1);
        left(dx+1);
        up();
    }
}