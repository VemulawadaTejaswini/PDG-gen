import java.util.*;
import java.lang.Math;

class Dice{
    public static int[] saikoro(String h, int[] d){
        int surface = 0;
            switch (h) {
            case "E":
                surface = d[4];
                d[4] = d[6]; d[6] = d[3]; d[3] = d[1]; d[1] = surface;
                break;
                
            case "W":
                surface = d[3];
                d[3] = d[6]; d[6] = d[4]; d[4] = d[1]; d[1] = surface; 
                break;
                
            case "S":
                surface = d[5];
                d[5] = d[6]; d[6] = d[2]; d[2] = d[1]; d[1] = surface; 
                break;
                
            case "N":
                surface = d[2];
                d[2] = d[6]; d[6] = d[5]; d[5] = d[1]; d[1] = surface; 
                break;
                
            }
        return d;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        int[] d = new int[7];
        for(int i=0;i<6;i++){
            a[i+1] = sc.nextInt();
        }
        for(int i=0;i<6;i++){
            d[i+1] = sc.nextInt();
        }
        String[] s = {"W", "E", "S", "N"};
        String h = "";
        int num =0;
        for(int i=0;i<1000;i++){
            num = (int)(Math.random()*4);
            h = s[num];
            Dice.saikoro(h, d);
            if(Arrays.equals(a,d)){
                System.out.println("Yes");
                break;
            }
            if(i==1000-1){
                System.out.println("No");
            }
        }
    }
}
