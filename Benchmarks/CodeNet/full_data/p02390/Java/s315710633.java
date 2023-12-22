public class Watch {

	public static void main(String[] args) {
		int S=46979;
		
		show(S);
	}
	
	public static void show(int S) {
		int h;
		int m;
		int s;
		
		h=S/(3600);
		m=(S/60)-(h*60);
		s=S-((h*3600)+(m*60));
					
		System.out.println(h+":"+m+":"+s);
	}
		
}