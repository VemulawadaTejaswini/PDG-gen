import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bunbo=0;
		int bunsi=0;
		int kurai=0;
		while(sc.hasNext()){
			bunsi=Integer.parseInt(sc.next());
			bunbo=Integer.parseInt(sc.next());
			kurai=Integer.parseInt(sc.next());
			int kotae=wa(bunsi,bunbo,kurai,0);
			System.out.println(kotae);
		}

	}

	public static int wa(int a,int b,int c ,int d) {
		int souwa=d;
		a=a%b;
		int res=(a*10)/b;
		a=(10*a)%b;
		if(c==0) {return souwa;}
		else{souwa+=res+wa(a,b,c-1,souwa);
		return souwa;
		}
	}
}
