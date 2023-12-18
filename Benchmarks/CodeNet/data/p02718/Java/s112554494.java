import java.util.*;

class Main{
  //QuickSort
	static void swap(int[] a, int idx1, int idx2){
 		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}

	static void quickSort(int[] a, int left, int right){
  		int pl = left;
  		int pr = right;
  		int x  = a[(pl+pr)/2];

  		do{
    		while (a[pl] < x) pl++;
    		while (a[pr] > x) pr--;
    		if(pl <= pr)
       			swap(a, pl++, pr--);
  		}while(pl <= pr);

  		if(left < pr) quickSort(a,left,pr);
  		if(pl < right) quickSort(a,pl,right);
	}
  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[N];
    int sum_vote = 0;
    for(int i = 0; i < N; i++){
      A[i] = sc.nextInt();
      sum_vote += A[i];
    }
	
    //昇順に並び替え
    quickSort(A,0,N-1);
    
    int count = 0;
    int judge = 0;
    for(int i = N-1; i >= 0; i--){
      if ( A[i]*4*M >= sum_vote)
        count++;
      if(count == M){
        judge = 1;
        break;
      }
    }
    
    if ( judge == 0)
      System.out.println("No");
    else
      System.out.println("Yes");
    
  }
}
