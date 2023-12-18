import java.math.BigInteger;
import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
//map.containsKey(A)
//Map<String, Integer> map = new HashMap<String, Integer>(n);
//ArrayList<String> cc = new ArrayList<>(n);
//Collections.sort(list);
//Array.sort(list);
//Arrays.asList(c).contains("a")

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	//static String eikomoji[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	static int Y,N;
	public static void main(String[] args) {
	int ans=0;
	long N=sc.nextLong();
	long K=sc.nextLong();
	//String N=sc.next();
//	String K=sc.next();
//	BigInteger s1 = new BigInteger(N);
	//BigInteger s2 = new BigInteger(K);
	long min;
	long v=N%K;
	min=Math.min(v, Math.abs(v-K));
	
	p(min);
	
	
	}
}
