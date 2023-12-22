import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int N;
	String[] C,D;
	int minj;
	String key;
	int num1,num2;
	
	public void input(){
		N=sc.nextInt();
		C = new String[N];
		D = new String[N];
		for(int i=0; i<N; i++){
			C[i]=sc.next();
			D[i] = C[i];
		}
	}
	
	public void bubblesort(){
		for(int i=0; i<=N-1; i++){
			for(int j=N-1; j>=i+1; j--){
				num1 = Integer.parseInt( C[j].substring(1) );
				num2 = Integer.parseInt(C[j-1].substring(1));
				if(num1< num2){
					key = C[j];
					C[j] = C[j-1];
					C[j-1] = key;
				}
			}
		}
		output(C);
		System.out.println("Stable");
	}
	
	public void selectionsort(){
		for(int i=0; i<=N-1; i++){
			minj = i;
			for(int j=i; j<=N-1; j++){
				num1 = Integer.parseInt( D[j].substring(1) );
				num2 = Integer.parseInt(D[minj].substring(1));
				if(num1 < num2){
					minj = j;
				}
			}
			key = D[i];
			D[i] = D[minj];
			D[minj] = key;
		}
		output(D);
		stability();
	}
	
	public void stability() {
		int flag=0;
		for(int i=0; i<N; i++) {
			if(C[i].compareTo( D[i] ) != 0) flag++;
		}
		if(flag == 0) System.out.println("Stable");
		else System.out.println("Not Stable");
	}
	
	public void output(String[] A){
		System.out.print(A[0]);
		for(int i=1; i<N; i++){
			System.out.print(" "+A[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Main obj = new Main();
		obj.input();
		obj.bubblesort();
		obj.selectionsort();
	}
}

