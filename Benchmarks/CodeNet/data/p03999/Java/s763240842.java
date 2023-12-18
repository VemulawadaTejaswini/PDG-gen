import java.util.*;
 
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long result = 0;
		int n = Long.toString(a).length()-1;
		for(int i = 0; i < 1<<n; i++){
		    long tmp = 0;
		    for(int j = 0; j < n+1; j++){
		        int b = String.valueOf(a).charAt(j) - '0';
		        if((i>>j&1) == 1){
		            result += tmp*10+b;
		            tmp = 0;
		        }else{
		            tmp = tmp*10+b;
		        }
		    }
		    result += tmp;
		    //System.out.println(result);
		}
    //System.out.println(result);
  }
}//解答見ても全然わからない