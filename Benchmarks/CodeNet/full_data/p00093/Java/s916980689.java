import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	boolean[] leap = new boolean[3001];
	setLeap(leap);
	int data = 0;
	while(kbd.hasNext()){
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    if(a!=0 && b!=0 && data>0){
		System.out.println();
    		solve(a, b, leap);
		data++;
	    }
	    else if(a!=0 && b!=0){
		solve(a, b, leap);
		data++;
	    }
	}
    }

    static void solve(int a, int b, boolean[] leap){
	int i, cnt=0;
	for(i=a; i<=b; i++){
	    if(leap[i]){
		System.out.println(i);
		cnt++;
	    }
	}
	if(cnt == 0)
	    System.out.println("NA");
    }

    static void setLeap(boolean[] l){
	int i;
	for(i=0; i<l.length; i++){
	    if(i%4 == 0) l[i] = true;
	    if(i%100 == 0) l[i] = false;
	    if(i%400 == 0) l[i] = true;
	}
    }
}