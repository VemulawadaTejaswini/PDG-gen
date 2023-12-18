import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        boolean[] bool = new boolean[4];
        for(char c : s){
            if(c == 'N'){
                bool[0] = true;
            }else if(c == 'S'){
                bool[1] = true;
            }else if(c == 'E'){
                bool[2] = true;
            }else{
                bool[3] = true;
            }
        }
        if(!(bool[0] ^ bool[1]) && !(bool[2] ^ bool[3])){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}