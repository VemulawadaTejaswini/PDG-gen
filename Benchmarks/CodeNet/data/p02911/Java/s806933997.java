import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,q,x,y,z;
	int ans;
	int[] pl;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		k = sc.nextInt();
		q = sc.nextInt();

		pl = new int[n];

		for(int i=0;i<q;i++){
			pl[sc.nextInt()-1] += 1;
		}

		for(int i:pl){
			System.out.println(k-q+i>0?"Yes":"No");
		}
	}

	public static void main(String[] args){
		new Main();
	}
}