import java.util.BitSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		BitSet prime = prime(1000000);
		while(true){
			int a = in.nextInt();
			int d = in.nextInt();
			int n = in.nextInt();
			if(a == 0) return;
			int count = 0;
			while(count < n){
				if(prime.get(a)) count++;
				a+=d;
			}
			System.out.println(a-d);
		}
	}
	
	public static BitSet prime(int max){
		BitSet prime = new BitSet(max);
		prime.set(2, max);
		for(int i=prime.nextSetBit(2); i!=-1; i=prime.nextSetBit(i+1)){
			for(int j=2; j*i<=max; j++){
				prime.clear(j*i);
			}
		}
		return prime;
	}
}