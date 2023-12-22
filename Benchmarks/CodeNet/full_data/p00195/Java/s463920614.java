import java.util.*;
import java.lang.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);
	boolean f = true;

	while(sc.hasNext()){
	    St[] a = new St[5];
	    for(int i = 0; i < 5 && f; i++){
		a[i] = new St((char)('A'+i), (sc.nextInt()+sc.nextInt()));
		if(a[i].t == 0) f = false;
	    }
	    if(!f) break;

	    Arrays.sort(a);
	    a[0].print();
	}
    }

    public static void main(String[] args){
	new Main();
    }
}

class St implements Comparable{
    public int t;
    public char s;

    St() {}
    St(char s, int t) {
	this.s = s;
	this.t = t;
    }

    public int compareTo(Object obj){
	St st = (St)obj;

	if(this.t > st.t) return -1;
	if(this.t < st.t) return 1;
	return 0;
    }

    public void print(){
	System.out.println(String.valueOf(s)+" "+String.valueOf(t));
	return ;
    }
}