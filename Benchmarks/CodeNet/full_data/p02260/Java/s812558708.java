import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	//配列の要素数
	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
	
	//配列の要素
	int A[] = new int[n];	
	for(int i=0;i<A.length;i++){
	    A[i]= scanner.nextInt();
	}
	Sort(A,n);
    }
    //並べ替え
    private static void Sort(int A[], int n){
	int count = 0;
	
	for(int i=0; i < n; i++){
	    int minj = i;
	    for(int j=i; j < n; j++){
		if(A[j] < A[minj]){
		    minj = j;
		}
	    }
	    int a = A[i];
	    A[i] = A[minj];
	    A[minj] = a;
	    count++;
	    
	    /*int b = Judgement(A,n);
	      if(b == 1) break;*/
	}
	Print(A,n);
	System.out.println(count);
    }
    //表示
    private static void Print(int A[], int n){
	for(int k=0;k<A.length;k++){
	    System.out.print(A[k]);
	    if(k < (n-1)){
		System.out.print(" ");
	    }
	}
	System.out.println();
    }
    //並べ替えが終っているかを判定
    /*private static int Judgement(int A[], int n){
	int count = 0;
	for(int i=0; i < n; i++) if(A[i] == i+1) count++;
	if(count == 6) return 1;
	else return 0;
	}*/
}

