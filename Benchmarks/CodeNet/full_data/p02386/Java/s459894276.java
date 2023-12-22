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
        int i, j, k, l, m, ans=0, n = sc.nextInt();
        int[] count = new int[n+1];
        
        int[] a = new int[7];
        int[] d = new int[7];
        
        for(i=0;i<6;i++)a[i+1] = sc.nextInt();
        
        for(j = 0; j < n-1; j++){
        
            for(k = 0;k < 6; k++)d[k+1] = sc.nextInt();
            
            String[] s = {"W", "E", "S", "N"};
            String h = "";
            int num =0;
            
            for(l = 0; l < 1000; l++){
                num = (int)(Math.random()*4);
                h = s[num];
                Dice.saikoro(h, d);
                if(Arrays.equals(a,d)){
                    /*count[j]*/ans += 1;
                    //System.out.println(count[j]);
                    break;
                }
                /*else if(l == 1000-1){
                    count[j] = 0;
                    //System.out.println(count[j]);
                }*/
            }
        }
        /*for(m = 0; m < n - 1; m++){
            ans += count[m];
            //System.out.println(ans);
        }*/
        
        if(ans > 0 )System.out.println("No");
        else System.out.println("Yes");
    }
}
