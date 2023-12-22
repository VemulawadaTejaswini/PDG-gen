import java.util.*;

class Main {
	//1~100みたいにするか
	static void sort(int data[],int number){
		for(int i=0; i<data.length-1; i++){
			int minindex=i;
			for(int j=i+1; j<data.length; j++){
				if(data[minindex]>data[j]) minindex=j;
			}
			int box=data[minindex];
			data[minindex]=data[i];
			data[i]=box;
		}
	}
	
	static int search(int data1[],int data2[]){
		//data1にdata2のデータがいくつあるか探す。二部探索法を用いる。
		int counter=0;
		for(int i=0; i<data2.length; i++){
			int left=0;
			int right=data1.length;
			if(data2[i]<data1[left] || data2[i]>data1[right-1]) continue;
			while(true){
				int center=(left+right)/2;
				//探してるのは左、もっと小さい
				if(data1[center]<data2[i])  left=center+1;
				///探してるのは右、もっと大さい
				else if(data1[center]>data2[i]) right=center-1;
				else if(data1[center]==data2[i]){ //一緒
					counter++;
					break;
				}
				if(left>right) break;
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter=0;
		int n = sc.nextInt();
		int S[] = new int[n];
		for(int i=0; i<n; i++) S[i] =sc.nextInt();
		sort(S,n);

		int q = sc.nextInt();
		int T[] = new int[q];
		for(int i=0; i<q; i++) T[i] =sc.nextInt();
		
		System.out.println(search(S,T));
		
	}

}