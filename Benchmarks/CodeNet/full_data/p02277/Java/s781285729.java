import java.util.*;

class Main{
	static int flg=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Card A[] = new Card[n];
		for(int i=0; i<n; i++){
			A[i] = new Card();
			A[i].pic = sc.next();
			A[i].num = sc.nextInt();
		}
		quicksort(A, 0, n-1);
		if(flg == 0) System.out.println("Stable");
		else         System.out.println("Not stable");
		for(int i=0; i<n; i++){
			System.out.println(A[i].pic+" "+A[i].num);
		}
	}
	static void quicksort(Card A[], int p, int r){
		if(p < r){
			int q = partition(A, p, r);
			quicksort(A, p, q-1);
			quicksort(A, q+1, r);
		}
	}
	static int partition(Card A[], int p, int r){
		Card work;
		int i = p-1;
		for(int j=p; j<=r-1; j++){
			if(A[j].num <= A[r].num){
				i++;
				work = A[i];
				A[i] = A[j];
				A[j] = work;
			}
		}
		i++;
		for(int j=i+1; j<=r-1; j++){
			if(A[j].num == A[i].num){
				flg=1;
			}
		}
		work = A[i];
		A[i] = A[r];
		A[r] = work;
		return i;
	}
}
class Card{
	String pic;
	int num;
}