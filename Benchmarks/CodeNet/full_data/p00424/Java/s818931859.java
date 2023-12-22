import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		String[] in = new String[n];
		String[] out = new String[n];
		String s = "";
		int i;

		for(i=0; i<n; i++){
		    in[i] = kbd.next();
		    out[i] = kbd.next();
		}

		n = kbd.nextInt();
		for(; n>0; n--){
		    String a = kbd.next();
		    for(i=0; i<in.length; i++){
			if(in[i].equals(a)) {
			    s += out[i];
			    break;
			}
			else if(i==in.length-1 && !in[i].equals(a)){
			    s += a;
			    break;
			}
			else ;
		    }
		}
		System.out.println(s);
	    }
	}
    }
}