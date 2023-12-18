import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public long[] ue, naka, sita;
	public static void main(String[] args){
		Main meu = new Main();
	}
	
	public Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ue = new long[n];
		naka = new long[n];
		sita = new long[n];
		int i;
		long meu, rinrin, ibubu, c=0;
		for(i = 0; i < n;++i){
			ue[i] = sc.nextInt();
		}
		for(i = 0; i < n;++i){
			naka[i] = sc.nextInt();
		}
		for(i = 0; i < n;++i){
			sita[i] = sc.nextInt();
		}
		Arrays.sort(ue);Arrays.sort(naka);Arrays.sort(sita);
		for(i = 0; i < n;++i){
			meu = naka[i];
			rinrin = lower_bound(ue, meu, n);
			ibubu = upper_bound(sita, meu, n);
			c += rinrin*ibubu;
		}
		System.out.println(c);
	}
	
	public long upper_bound(long[] array, long item, int size){
		long index = Arrays.binarySearch(array, item);
		if(index < 0) return (size - ((index + 1) * -1));
		return size - 1 - index;
	}
	
	public long lower_bound(long[] array, long item, int size){
		long index = Arrays.binarySearch(array, item);
		if(index < 0) return (index + 1) * -1;
		return index;
	}
}
