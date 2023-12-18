import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int n =stdIn.nextInt();
	String S = stdIn.next();
	String T = stdIn.next();
	char[] s = new char[n];
	char[] t = new char[n];
	for(int i=0;i<n;i++){
	    s[i]=S.charAt(i);
	    t[i]=T.charAt(i);
	    System.out.print(s[i]);
	    System.out.print(t[i]);
	}
	System.out.println("");
    }
}
	    
