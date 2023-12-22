import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int X = sc.nextInt();
        for(int i=-1000; i<=1000; i++){
            for(int j=-1000; j<=1000; j++){
                double Y = Math.pow(i, 5) - Math.pow(j, 5);
                if(Y==X){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}