import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
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
	
	
	public static void main(String[] args) {
	int a=sc.nextInt();
	int b=sc.nextInt();
	List<String> cc=new ArrayList<String>();
	String ans[]=new String[2];
	ans[0]="";
	ans[1]="";
		for(int i=0;i<a;i++) {
			ans[0]=ans[0]+b;
		}
	
		for(int i=0;i<b;i++) {
			ans[1]=ans[1]+a;
		}
		if(a>b) {
			p(ans[0]);
		}else {
			p(ans[1]);
		}//p(a+"     "+b);
		/*Collections.sort(cc);
		p(a+"     "+b);
		p(ans[0]);
		p(ans[1])*/;
	
 }
}
