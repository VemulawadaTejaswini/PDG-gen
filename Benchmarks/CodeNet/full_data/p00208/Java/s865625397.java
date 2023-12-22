import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    long n = kbd.nextLong();
	    if(n!=0) solve(n);
	}
    }

    static void solve(long n){
	String s = Long.toOctalString(n);
	long[] k = new long[s.length()];
	int i;
	for(i=0; i<s.length(); i++)
	    k[i] = Long.parseLong(s.substring(i, i+1));
	s = "";
	for(i=0; i<k.length; i++){
	    if(k[i]>=4) k[i]++;
	    if(k[i]>=6) k[i]++;
	    s += Long.toString(k[i]);
	}
	n = Long.parseLong(s);
       
	System.out.println(s);
    }
}