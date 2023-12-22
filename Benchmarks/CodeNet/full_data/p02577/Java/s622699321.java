import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S  = sc.next();
    char[]ss = S.toCharArray();
    
    int all = 0;
    for(int i=0; i<S.length(); i++) {
    	all += ss[i]-48;
    }	
    	if(all%9 == 0) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    }
}
}