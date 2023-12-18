import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		ArrayList<Pair> pair = new ArrayList<>();
		int N = sc.nextInt();
		int ar[] = new int[N];

		for(int n=0;n<N;n++){
			ar[n] = sc.nextInt();
		}
		for(int n=0;n<N;n++){
			for(int m=n+1;m<N;m++){
				if(Math.pow(2,(int)(Math.log(ar[n]+ar[m]) / Math.log(2))) == ar[n]+ar[m]){
					pair.add(new Pair(n,m));
				}
			}
		}
		for(Pair p : pair){
			//System.out.println(p.a+","+p.b);
		}
		System.out.println(0);

	}
	static class Pair{
		int a;
		int b;
		Pair(int a,int b){
			this.a = a;
			this.b = b;
		}
	}
}