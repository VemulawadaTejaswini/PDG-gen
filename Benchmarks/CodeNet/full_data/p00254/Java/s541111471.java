import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int l=0,s=0,tmp=0;
	String n="";
	int[] nint = new int[4];
	int count = 0;

	while(sc.hasNext()){
	    n = sc.next();
	    if(n.equals("0000")) break;

	    count = 0;l = 0;s = 0;

	    for(int i = 0;i<nint.length;i++) nint[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
	    
	    boolean check = true;
	    for(int i = 0;i<nint.length;i++){
		for(int j = 0;j<nint.length;j++){
		    if(nint[i]!=nint[j]) check = false; 
		}
	    }
	    if(check){ System.out.println("NA"); continue; }

	    while(l-s!=6174 && !n.equals("6174")){
		Arrays.sort(nint);
		l = 0;s = 0;
		
		l += nint[0] * 1;
		l += nint[1] * 10;
		l += nint[2] * 100;
		l += nint[3] * 1000;
		
		s += nint[3] * 1;
		s += nint[2] * 10;
		s += nint[1] * 100;
		s += nint[0] * 1000;

		tmp = l-s;
		nint[0] = tmp%10; tmp /= 10;
		nint[1] = tmp%10; tmp /= 10;
		nint[2] = tmp%10; tmp /= 10;
		nint[3] = tmp%10; tmp /= 10; 
	    
		count++;
	    }

	    System.out.println(count);
	}
    }
}