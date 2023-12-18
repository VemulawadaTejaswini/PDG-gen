import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.put(sc.nextInt());
        hs.put(sc.nextInt());
        hs.put(sc.nextInt());
        if(hs.size() != 2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}