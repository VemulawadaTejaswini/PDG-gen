import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    solve(a, b);
	}
    }

    static void solve(int a, int b){
	int ans = Math.min(a, b);
	while(!(a%ans==0 && b%ans==0)) ans--;
	System.out.println(ans);
    }
}