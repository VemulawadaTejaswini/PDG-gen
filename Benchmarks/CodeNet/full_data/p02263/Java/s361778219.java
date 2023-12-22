import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		String s;
		while(sc.hasNext()){
			s = sc.next();
			if(s.equals("+")){
				int n1 = stk.pop();
				int n2 = stk.pop();
				stk.push(n1+n2);
			}
			else if(s.equals("-")){
				int n1 = stk.pop();
				int n2 = stk.pop();
				stk.push(n2-n1);
			}
			else if(s.equals("*")){
				int n1 = stk.pop();
				int n2 = stk.pop();
				stk.push(n1 * n2);
			}
			else{
				stk.push(Integer.valueOf(s));
			}
		}
		cout(stk.pop());
	}
	
	
	
	public static boolean isPrime(int n){
		for(int i=2;i<=n*n;i++){
			if(n%i==0) return true;
		}
		return false;
	}
	public static int gcd(int a,int b){
		if(a%b==0) return b;
		else return gcd(b,a%b);
	}
	public static void showary(int[] ary){
		for(int i=0;i<ary.length-1;i++){
			System.out.print(ary[i]+" ");
		}
		cout(ary[ary.length-1]);
	}
	public static void cout(String n){
		System.out.println(n);
	}
	
	public static void cout(int n){
		System.out.println(n);
	}
	public static void cout(boolean n){
		if(n==true){
			cout("true");
		}else{
			cout("false");
		}
	}
}