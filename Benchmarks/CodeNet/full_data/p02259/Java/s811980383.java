import java.util.Scanner;
class Main{
    
    static int[] A;

    public static void main(String[] args){
	int i = 0;
	Main bubble = new Main();
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	A = new int[n];
	
	while(i<n){
	    A[i++] = scan.nextInt();
	    //	    i++;
	}
	int count = 0;
	count = bubble.bubblesort(A);
	bubble.call(n);
	System.out.println(count);
    }
    


    public int bubblesort(int[] A){
	int count =0;
	for(int i = 0;i<A.length ;i++){

	    for(int j = A.length-1;j >=i+1;j--){
		if(A[j]<A[j-1]){
		    swap(j,j-1);
		    count++;
		}
	    }
	}
	return count;
	
    }

    public void swap(int x,int y){
	int m = 0;
	int n = 0;
	m = A[x];
	n = A[y];
	A[x] = n;
	A[y] = m;

    }

    public void call(int n){
	int i =0;
	while(true){
	    if(i!=0) System.out.print(" ");
	    System.out.print(A[i]);
	    i++;
	    if(i==n)break;
	}
	System.out.println();
    }
    

}