import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static long[] prime;
	static int n;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		while(read()){
			slove();
		}
	}
	static boolean read(){
		if(!sc.hasNextInt())
			return false;
		n = sc.nextInt();
		return true;
	}
	static void Prime(int a){
		prime = new long[a+1];
		for(int i = 1; i < prime.length; i++)
			prime[i] = 1;
		
		for(long i = 2; i < prime.length; i++){
			if(prime[(int) i] == 1){
				for(long j = i; i*j < prime.length; j++)
				prime[(int) (i*j)] = 0;	
			}
		}
	}
	
	static void slove(){
		int count = 0;
		Prime(n);
		for(int i = 2; i < prime.length; i++){
			if(prime[i] == 1)
				count++;
		}
		System.out.println(count);
	}
}