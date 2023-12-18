import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] split = str.split("");
        int c = 0;

        for(int i = 0; i < 3; i++){
            if(split[i].equals(split[i+1])){
                //System.out.println(split[i]+split[i+1]);
                System.out.println("Bad");
                c++;
            }else{
                //System.out.println("Good");
            }
        }

        if(c == 0){
            System.out.println("Good");
        }
        
    }
}
