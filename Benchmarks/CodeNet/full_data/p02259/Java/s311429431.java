public class BubbleSort{
    
    static int[] A;

    public void bubblesort(int[] A){

	for(int i = 0;i<A.length ;i++){

	    for(int j = A.length-1;j >=i+1;j--){
		if(A[j]<A[j-1]){
		    swap(j,j-1);
		}
	    }
	}
	
    }

    public void swap(int x,int y){
	int m = 0;
	int n = 0;
	m = A[x];
	n = A[y];
	A[x] = n;
	A[y] = m;

    }

    public void call(){
	int i =0;
	while(true){
	    System.out.print(A[i]);
	    i++;
	    if(i==5)break;
	}
    }

}