import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] intArray = Arrays.stream(sc.nextLine().split(" ")) 
                        .mapToInt(Integer::parseInt) 
                        .toArray();                        
                        
                        
        System.out.println(intArray[0] - intArray[1] +1);
    }
}