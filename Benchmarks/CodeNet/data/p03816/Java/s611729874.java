import java.util.*;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] Items = new int[N];
		int[] Sets = new int[N];
		int kind=0;
		for(int i=0;i<N;i++){
			Items[i] = Integer.parseInt(sc.next());
		}
		for(int i=0;i<N;i++){
			//System.out.println(Arrays.binarySearch(Sets, Items[i]));
			if(Arrays.binarySearch(Sets, Items[i])<0){
				Sets[kind]=Items[i];
				Arrays.sort(Sets);
				kind++;
			}
		}
		int MaxN=kind-1+kind%2;
		System.out.println(MaxN);
		sc.close();
	}
}