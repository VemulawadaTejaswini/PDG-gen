import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int N;
	int[] A;
	int count=0;
	int flag;
	int key;
	
	public void input(){
		N=sc.nextInt();
		A = new int[N];
		for(int i=0; i<N; i++){
			A[i]=sc.nextInt();
		}
	}
	
	public void bubblesort(){
		flag=1;
		while(flag==1){
			flag=0;
			for(int j=N-1; j>=1; j--){
				if(A[j] < A[j-1]){
					key = A[j];
					A[j] = A[j-1];
					A[j-1] = key;
					flag=1;
					count++;
				}
			}
		}
	}
	
	public void output(){
		System.out.print(A[0]);
		for(int i=1; i<N; i++){
			System.out.print(" "+A[i]);
		}
		System.out.println("\n"+count);
	}
	
	public static void main(String[] args){
		Main obj = new Main();
		obj.input();
		obj.bubblesort();
		obj.output();
	}
}
