import java.util.*;

public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int m = kbd.nextInt();
	while(m>0){
	    int start = kbd.nextInt();
	    int year = kbd.nextInt();
	    int n = kbd.nextInt();
	    int total = 0;
	    while(n>0){
		int s = management(start, year);
		if(total < s) total=s;
		n--;
	    }
	    System.out.println(total);
	    m--;
	}

    }
    static int management(int s, int y){
	int r = kbd.nextInt();
	double i = kbd.nextDouble();
	int f = kbd.nextInt();
	    
	if(r==1){
	    for(; y>0; y--){
		int a = (int)Math.floor(s*i);
		s = s-f + a;
	    }
	    return s;
	}
	else {
	    int m=0;
	    for(; y>0; y--){
		m += (int)Math.floor(s*i);
		s -= f;
	    }
	    s += m;
	    return s;
	}
    }
}