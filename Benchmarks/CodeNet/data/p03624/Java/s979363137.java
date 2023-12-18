import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]ss = S.toCharArray();

    for(int i=0; i<S.length(); i++) {
    	ss[i] = ss[i+0];

    }
    	Arrays.sort(ss);
    int ans = 0;
    for(int i=0; i<S.length()-1; i++) {
    	if(ss[i] <= ss[i+1]-2) {
    		ans = ss[i] + 0;
    		break;
    	}
    }
    if(ss[0] != 97) {
    	System.out.println("a");
    }else if(ans != 0) {
    	System.out.println((char)(ans+1));
   	}else if(ss[S.length()-1] == 'z'){
    		System.out.println("None");
   	}else {
   		System.out.println((char)(ss[S.length()-1] +1));
   	}
    }
}
