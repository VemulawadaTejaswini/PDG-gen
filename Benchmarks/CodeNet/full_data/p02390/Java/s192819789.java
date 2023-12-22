public class Main {
	public static void main(String[] age){
		int S = new java.util.Scanner(System.in).nextInt();
		int s=0, m=0, h=0;
		while(S>3600){
			h++;
			S=S-3600;
		}
		while(S>60){
			m++;
			S=S-60;
		}
		s=S;
		System.out.println(h + ":" + m + ":" + s);
	}
}