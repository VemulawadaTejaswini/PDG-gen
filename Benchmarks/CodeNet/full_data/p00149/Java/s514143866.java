import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	solve();
    }

    static void solve(){
	int[] left = new int[4];
	int[] right = new int[4];

	while(kbd.hasNext()){
	    double l = kbd.nextDouble();
	    double r = kbd.nextDouble();
	    set(left, l);
	    set(right, r);
	}

	for(int i=0; i<left.length; i++){
	    System.out.println(left[i]+" "+right[i]);
	}
    }

    static void set(int[] side, double n){
	if(n >= 1.1) side[0]++;
	else if(n >= 0.6) side[1]++;
	else if(n >= 0.2) side[2]++;
	else side[3]++;
    }
}