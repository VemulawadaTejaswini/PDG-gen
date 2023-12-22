import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
     public static void main(String[] args){
     	
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            long n = Long.parseLong(br.readLine());
            
        	System.out.print(n + ":");
        	primeFact(n);
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
	
	static void primeFact (long n) {
		List<Long> rel = new ArrayList<Long>();
		
		for (long sqrtRel = (long)Math.sqrt(n); sqrtRel >= 2;) {
			if (n%sqrtRel == 0) {
				rel.add(sqrtRel);
				n = n/sqrtRel;
			} else {
				sqrtRel--;
			}
		}
		
		for (int i = rel.size() - 1; i >= 0; i--) {
			System.out.print(" " + rel.get(i));
		}
		if (rel.size() == 0) {
			System.out.println(" " + n);
		} else {
			System.out.println();
		}
	}
}