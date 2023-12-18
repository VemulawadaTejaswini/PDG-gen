/**
 * Created by Raph on 21/09/2016.
 */
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cardsInput = sc.next();
        char alice[] = cardsInput.toCharArray();
        cardsInput = sc.next();
        char bob[] = cardsInput.toCharArray();
        cardsInput = sc.next();
        char charlie[] = cardsInput.toCharArray();
        int currA = 0;
        int currB = 0;
        int currC = 0;
        char curr = 'a';
        while (currA != alice.length 	&&
                currB != bob.length 	&&
                currC != charlie.length){
            if (curr == 'a') {
                curr = alice[currA];
                currA ++;
            } else if (curr == 'b') {
                curr = bob[currB];
                currB ++;
            } else {
                curr = charlie[currC];
                currC ++;
            }
        }
        System.out.println(Character.toUpperCase(curr));
    }
}