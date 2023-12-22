import java.util.Scanner;

class ex1{
    
    int N;
    int key,j;
    int[] array = new int[1001];

    public void input(){
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	for(int i=0; i<N; i++){
	    array[i] = sc.nextInt();
	}
    }
    
    public void sort(){
	for(int i=1; i<=N-1; i++){
	    key = array[i];
	    j = i-1;
	    while(j >= 0 && array[j] > key){
		array[j+1] = array[j];
		j--;
	    }
	    array[j+1] = key;
	    for(int k=0; k<N; k++){
		System.out.print(array[k]+" ");
	    }
	    System.out.println();
	}
    }
    
    public static void main(String[] args){
	ex1 obj = new ex1();
	obj.input();
	obj.sort();
    }
}

