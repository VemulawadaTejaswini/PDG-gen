import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	//配列の要素数
	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
	
	//配列の要素
	int A[] = new int[101];	
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<A.length;i++){
	    A[i]= sc.nextInt();
	}
	
	//並べ替え
	for(int i=1; i < n; i++){
	    int v = A[i];
	    int j = i-1;
	    
	    for(int k=0;k<A.length;k++){
	    	System.out.print(String.format("%-2d",A[k]));
	    }
	    
	    while(j >= 0 && A[j] > v){
		A[j+1] = A[j];
		j--;
	    }                                            
	    A[j+1] = v;
	    System.out.println();
	}
	
	for(int k=0;k<A.length;k++){
	    System.out.print(String.format("%-2d",A[k]));
	}
	System.out.println();
    }
}

