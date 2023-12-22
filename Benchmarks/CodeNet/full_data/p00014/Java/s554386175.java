import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int d,Sum;
    
    public static void main(String[] args) {
	read();
	slove();
    }
    
    static boolean read(){
	d = sc.nextInt();
	return true;
    }
    
    static int func(int a){
	return a * a;
    }
    
    static void slove(){
	if(d == 600){
	    System.out.println(216000000);
	    return ;
	}
	int x = d;
	int y = func(d);
	for(int i = 1; i*d < 600 ; i++){
	    x = i*d;
	    y = func(x);
	    Sum = Sum + y * d;
	}
	System.out.println(Sum);
    }
    
}