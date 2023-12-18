import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        String[] vowel = {"a", "i" , "u" , "e" , "o"};
        for(String a : vowel){
            if(c.equals(a)){
                System.out.pritnln("vowel");
                return;
            }
            
        }
        System.out.println("consonant");
        }        
    }

