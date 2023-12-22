import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    Dice d = new Dice();
	    int n = kbd.nextInt();
	    if(n!=0) solve(d, n);
	}
    }

    static void solve(Dice d, int n){
	int sum = 1;
	while(n>0){
	    String s = kbd.next();
	    d.roll(s);	
	    sum += d.getTop();
	    n--;
	}
	System.out.println(sum);
    }
}

class Dice{
    int[] d;
    public Dice(){
	d = new int[3];
	d[0]=1; d[1]=2;d[2]=3;
	// top, south, east
    }
    public void roll(String s){
	int a = d[0];
	int b = d[1];
	int c = d[2];
	if(s.equals("North")){
	    d[0] = b;
	    d[1] = 7-a;
	}
	else if(s.equals("East")){
	    d[0] = 7-c;
	    d[2] = a;
	}
	else if(s.equals("West")){
	    d[0] = c;
	    d[2] = 7-a;
	}
	else if(s.equals("South")){
	    d[0] = 7-b;
	    d[1] = a;
	}
	else if(s.equals("Right")){
	    d[1] = c;
	    d[2] = 7-b;
	}
	else if(s.equals("Left")){
	    d[1] = 7-c;
	    d[2] = b;
	}
	//System.out.println(d[0]+" "+d[1]+" "+d[2]);
    }
    public int getTop(){
	return d[0];
    }
}	