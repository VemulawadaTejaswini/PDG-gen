import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] cl = sc.next().toCharArray();
        if(cl[2] == cl[3] && cl[4] == cl[5]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}