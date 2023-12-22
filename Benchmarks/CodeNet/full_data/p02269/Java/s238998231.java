import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        
        int N = in.nextInt();
        for (int i = 0; i < N; i++){
            String c1 = in.next();
            String c2 = in.next();
            
            if (c1.equals("insert")){
                array.add(c2);
            }else if(c1.equals("find")){   
                if (array.contains(c2)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
            
            System.out.println(c2);
        }
    }
}