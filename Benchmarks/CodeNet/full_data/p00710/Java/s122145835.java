import java.util.Scanner;

public class Main {

	static int n,r,p,c;
	static int[] card;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			n=cin.nextInt();
			r=cin.nextInt();
			if(n+r==0){
				break;
			}
			card=new int[n];
			for(int i = 0;i<n;i++){
				card[i]=i+1;
			}
			for(int i = 0;i<r;i++){
				p=cin.nextInt();
				c=cin.nextInt();
				shuffle();
			}
			System.out.println(card[n-1]);
		}
	}
	static void shuffle(){
		int[] tmp = new int[c];
		for(int i = 0;i<c;i++){
			tmp[i]=card[i+n-c-p+1];
		}
		for(int i = 0;i<p-1;i++){
			card[i+n-c-p+1]=card[i+n-p+1];
			out();
		}
		for(int i = 0;i<c;i++){
			card[i+n-c]=tmp[i];
		}
		out();
	}
	static void out(){
		for(int i = 0;i<n;i++){
			//System.out.println(card[i]);
		}
		//System.out.println();
	}
}