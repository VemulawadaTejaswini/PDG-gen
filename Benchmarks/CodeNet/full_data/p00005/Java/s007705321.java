import java.util.Scanner;
 class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int GCD[] = new int[100];
		int LCM[] = new int[100];
		int i = 0;
		while(sc.hasNext()){
			int a = sc.nextInt(), b =sc.nextInt();
			GCD[i] = GCD(a,b);
			LCM[i] = (a/GCD[i])*(b/GCD[i])*GCD[i];
			i++;
		}
		for(int j = 0; j < i; j++){
			System.out.println(GCD[j]+" "+LCM[j]);
		}
		
	}
	
	public static int GCD(int a, int b){
		Scanner sc = new Scanner(System.in);
		int x ;
		if(a < b){
			x = a;
			a = b;
			b = x;
		}
		while(true){
			x = a%b;
			if(x == 0) break;
			a = b;
			b = x;
		}
		return b;
	}
}