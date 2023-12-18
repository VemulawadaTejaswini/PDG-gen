import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int k =sc.nextInt();
		int a[]= new int[n];
		int kazu[]= new int[n];
		for(int i=0;i<n;i++) {
			kazu[i]=0;
		}

		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
			kazu[a[i]-1]++;
		}

		mergeSort(kazu,0,n);
		int shiguma =0;

		for(int i=0;i<n-k;i++) {
			shiguma =shiguma+ kazu[i];
		}


		System.out.print(shiguma);



	}
	public static void mergeSort(int[] kazu, int start, int end) {
		int middle = (start+end)/2;
		if(end-start>1) {
			mergeSort(kazu, start,middle);
			mergeSort(kazu, middle,end);
			int[] temp = new int[end-start];
			for(int i=start;i<end;i++) {
				temp[i-start]=kazu[i];
			}
			int a = start;
			int b = middle;
			for(int i=start;i<end;i++) {
				if(a<middle&&(b>=end||temp[a-start]<temp[b-start]) ) {
					kazu[i]=temp[a-start];
					a=a+1;
				}
				else{
					kazu[i]=temp[b-start];
					b=b+1;
				}
			}
		}
	}

}