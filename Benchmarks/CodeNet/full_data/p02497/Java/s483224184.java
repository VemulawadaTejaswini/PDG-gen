import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {

	while(kbd.hasNext()){
	    int m = kbd.nextInt();
	    int f = kbd.nextInt();
	    int r = kbd.nextInt();

	    if(!(m==-1 && f==-1 && r==-1)){
		int p = m+f;
		if(m==-1 || f==-1) System.out.println("F");
		if(p>=80) System.out.println("A");
		if(p>=65 && p<80) System.out.println("B");
		if(p>=50 && p<65) System.out.println("C");
		if(p>=30 && p<50) {
		    if(r>=50) System.out.println("C");
		    else System.out.println("D");
		}
		if(p<30) System.out.println("F");
	    }
	}
    }
}