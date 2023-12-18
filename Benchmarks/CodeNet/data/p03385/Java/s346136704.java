
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Pr_5 {

    public static void main(String[] args) {
        FastReader f = new FastReader();
        // int [] arr = { 1 , 6 , 120 , 496 , 2016, 8128 ,32640 , 130816};
        
        String s = f.next();
        byte aCounter=0 , bCounter=0 , cCounter=0;
        for(byte i =0;i<3 ; i++){
            switch(s.charAt(i)){
                case'a':
                    aCounter++;
                    break;
                case'b':
                    bCounter++;
                    break;
                case'c':
                    cCounter++;
                    break;
            }
        }
        if(aCounter!=0 && bCounter!=0 && cCounter!=0)System.out.println("Yes");
        else { System.out.println("No");}
    
}

     
     
     
 }

