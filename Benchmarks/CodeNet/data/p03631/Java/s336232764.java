import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;

public class Main{
    public static void main (String args[]){

        Scanner first = new Scanner(System.in);
        int first_word = first.nextInt();
        
        int hundred = first_word/100;
        first_word = first_word-hundred*100;
        int ten     = (first_word)/10;
        first_word = first_word - ten*10;
        
        int one     = first_word;
        if(hundred == one ){
            System.out.println("Yes");

        }else{
            System.out.println("NO");
            
        }
    }
}