import java.util.Scanner;

class Main{
	
	
	public static void main(String[] args) {
		new Main().Kei();
	}
	
	void Kei() {
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.next());
		String g="";
		
		for(int i=0;i<N;i++) {
			int t=Integer.parseInt(sc.next());
			int x=Integer.parseInt(sc.next());
			int y=Integer.parseInt(sc.next());
			g="No";
			if(t>=x+y) {
				if((t-(x+y)+2)%2==0)
					g="Yes";
			}
			if(g.equals("No"))
				break;
		}
		System.out.println(g);
		sc.close();
	}
	
}


