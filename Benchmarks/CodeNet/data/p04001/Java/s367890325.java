import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String S = s.next();
		long target = Long.valueOf(S);
		long result = target;
		
		for(int i = 1; i < (1<<(S.length() - 1)); i++) {
			long tmp = target;
			int keta = 1;
			for(int j = 0; j < S.length(); j++) {
				if(((i>>j)&1) == 1) {
					result += tmp%(Math.pow(10, keta));
					tmp /= Math.pow(10, keta);
					keta = 1;
				}else {
					keta++;
				}
			}
			result += tmp%(Math.pow(10, keta));
			
		}
		
		System.out.println(result);
    }
}
