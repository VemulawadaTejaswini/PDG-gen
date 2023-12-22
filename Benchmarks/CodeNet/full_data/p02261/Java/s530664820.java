import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String[] card = new String[N];
		for(int i=0;i<N;i++){
			card[i] = sc.next();
		}
		
		String[] B = new String[N];
		String[] S = new String[N];
		for(int i=0;i<N;i++){
			B[i]=card[i];
			S[i]=card[i];
		}
		
		bubbleSort(B, N);
		selectionSort(S,N);
		
		//??????
		for(int i=0;i<N-1;i++){
			System.out.print(B[i]+" ");
		}
		System.out.println(B[N-1]+" ");
		System.out.println("Stable");

		for(int i=0;i<N-1;i++){
			System.out.print(S[i]+" ");
		}
		System.out.println(S[N-1]+" ");
		if(isStable(B,S,N)){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}

	}
	
	public static void bubbleSort(String[] c,int N){
		for(int i=0;i<N-1;i++){
			for(int j=N-1;j>i;j--){
				int vj0=Integer.parseInt(c[j-1].substring(1,2));
				int vj1=Integer.parseInt(c[j].substring(1,2));
				if(vj1<vj0){
					String temp=c[j];
					c[j]=c[j-1];
					c[j-1]=temp;
				}
			}
		}
	}
	
	public static void selectionSort(String[] c,int N){
		for(int i=0;i<N-1;i++){
			int minj=i;
			for(int j=i;j<N;j++){
				int cj=Integer.parseInt(c[j].substring(1,2));
				int cmin=Integer.parseInt(c[minj].substring(1,2));
				if(cj<cmin) minj=j;
			}
			String temp=c[i];
			c[i]=c[minj];
			c[minj]=temp;
		}
	}
	
	public static boolean isStable(String[] b,String[] s, int N){
		boolean fstable = true;
		for(int i=0;i<N;i++){
			if(!b[i].equals(s[i])) fstable=false;
		}
		return fstable;
	}

}