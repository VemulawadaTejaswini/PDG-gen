
import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int [] count = new int[26];
        
        while(scan.hasNext()){
            String line  = scan.next();
            
            for(int i = 0; i < line.length(); ++i){
                if(Character.isLowerCase(line.charAt(i))){
                    ++count[line.charAt(i) - 'a'];
                }
                
                else if(Character.isUpperCase(line.charAt(i))){
                    ++count[line.charAt(i) - 'A'];
                }
            }
        }
        
        for(int i = 0; i < count.length; ++i){
            System.out.println((char)('a' + i) + " : " + count[i]);
        }
    }
}
