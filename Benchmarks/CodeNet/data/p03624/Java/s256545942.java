import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]ss = S.toCharArray();

    Arrays.sort(ss);
    int ans = 0;
    for(int i=0; i<S.length()-1; i++) {
    	if(ss[i]<= ss[i+1]-2) {
    		ans = ss[i];
    			break;
    	}
    }
    if(ss[0] != 'a') {
    	System.out.println("a");
    }else if(ans != 0) {
    		System.out.println((char)(ans+1));
    }else {
    		System.out.println("None");
    	}
    }
}