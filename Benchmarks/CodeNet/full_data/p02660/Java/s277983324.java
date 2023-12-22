import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
       
        long n = sc.nextLong();
        
        Set<Long> hash = new HashSet<>();
        long temp = n, c = 0;
        
        for(int i = 2; i * i <= n; ++i) {
            
            if(n % i == 0) {
                long count = 1;
                while(n % i == 0) {
                    count *= i;
                    if(!hash.contains(count)) { 
                        ++c;
                        hash.add(count);
                        count = 1;
                    }
                    n /= i;
                }
            }
        }
        
        if(n > 1 && !hash.contains(n)) {
            ++c;
        }
        
      System.out.println(c);
        
        out.flush();
    }
}