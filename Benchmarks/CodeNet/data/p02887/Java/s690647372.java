import java.util.*;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String line = sc.next();
	    String[] s = line.split("");
	    int count = 0;
	    int sum = 0;
	    for(int i = 0; i < N; i++) {
	        sum++;
	        if(i == N-1) {
	            break;
	        }
	        int j = i + 1;
	        count = 0;
	        while(true) {
	            if(s[i].equals(s[j])) {
	                j++;
	                count++;
	            }else if(count == 0){
	                break;
	            }else {
	                i += count;
	                break;
	            }
	        }
	    }
	    System.out.println(sum);
	}
}