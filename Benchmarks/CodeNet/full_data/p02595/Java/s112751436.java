import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        double d = sc.nextDouble(); 
        int count = 0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            double rad = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            if(rad <= d)count++;
        }
        System.out.println(count);
    }
}

class Monmo {
    
}
