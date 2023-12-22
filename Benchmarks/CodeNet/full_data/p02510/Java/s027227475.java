import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String st, sr, sr1, sr2, sr3;
	int t, k, l;
	while(true){
	    st = sc.next();
	    if(st.equals("-"))
		break;
	    k = st.length();
	    sr = st;
	    l=sc.nextInt();
	    for(int i=0; i<l; i++){
		t=sc.nextInt();
		sr1 = sr.substring(0,t);
		sr2 = sr.substring(t,k);
		sr = new StringBuilder().append(sr2).append(sr1).toString();
	    }
	    System.out.println(sr);
	}
    }
}