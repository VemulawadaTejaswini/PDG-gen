import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] alpha = new int[26];

        while(in.hasNext()){
            char[] str = in.nextLine().toLowerCase().toCharArray();

            for(int i = 0; i < str.length; i++){
                if(str[i] >= 'a' && str[i] <= 'z')alpha[str[i] - 97]++;
            }
        }
        for(int i = 0; i < 26; i++){
            System.out.printf("%c : %d\n", i + 97, alpha[i]);
        }
    }
}
