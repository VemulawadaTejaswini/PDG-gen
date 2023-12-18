import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int size = sc.nextInt();
        int[] orig = new int[size];
        int[] cards = new int[size];
        for(int i =0; i< size; i++){
            orig[i] = sc.nextInt();
            cards[i] = orig[i];
        }
        Arrays.sort(cards);
         for(int i =0; i<size; i++){
             int x = orig[i]; // x to be excluded
             int ans = 0;
             for(int j =0; j<size; j++){
                 int occ = 1;
                 if(cards[j] == x) occ--;
                 while(j+1 < size && cards[j] == cards[j+1]){
                     occ++;
                     j++;
                 }
                 if(occ>1){
                     ans += (occ*(occ-1))/2;
                 }  
             }
             System.out.println(ans); 
         }
    }
}