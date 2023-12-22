import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n=in.nextInt(), a=in.nextInt(), b=in.nextInt(),c=in.nextInt(), x=in.nextInt();
			if(n==0) return ;
			int i, pos=0;
			int xs[] = new int[n];
			for(i=0;i<n;i++) xs[i] = in.nextInt();
			for(i=0;i<=10000;i++){
				if(xs[pos] == x) pos++;
				if(pos==n) break;
				x = (a*x+b)%c;
			}
			System.out.println(i<=10000?i:-1);
		}
	}
	
}