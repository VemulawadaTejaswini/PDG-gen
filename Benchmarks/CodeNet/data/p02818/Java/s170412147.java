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

	long A=sc.nextLong();
	long B=sc.nextLong();
	long K=sc.nextLong();
	if(A>K) {
		A=A-K;
	}else if(A==K) {
		A=0;
	}else if(A<K) {
		K=K-A;
		A=0;
		if(B>=K) {
			B=B-K;
		}else if(B<K) {
			B=0;
		}
	}
	p(A+" "+B);
	}
}
