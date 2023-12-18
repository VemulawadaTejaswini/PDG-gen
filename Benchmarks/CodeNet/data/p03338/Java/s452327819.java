import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int foo = 0;
		String s;
		String b;
		String a;
		int max = 0;
		n = sc.nextInt();
		s = sc.next();
		
		for(int i = 1; i < n; i++){
			b = s.substring(0,i);
			a = s.substring(i,n);
			foo = 0;
			while(b.length() > 0){
				if(!a.replaceAll(b.substring(0, 1),"").equals(a)){
				foo++;
				}
				b = b.replaceAll(b.substring(0, 1),"");
			}
			max = Math.max(max, foo);
		}
		System.out.println(max);
	}
}
