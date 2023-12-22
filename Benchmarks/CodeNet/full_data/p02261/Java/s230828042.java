import java.io.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {

	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  //int N = sc.nextInt();
	  //String n = br.readLine();
	  int N = Integer.parseInt(br.readLine());
    //System.out.println(N);
    String str = br.readLine();
	  String C[] = str.split(" ");;
    String C2[] = new String[N];
  
	  /**/for(int i = 0;i < N;i++){
		   C2[i] = C[i];
	  }
	  /**///for(int i = 0;i < N;i++) System.out.print(C[i]+" ");
	  /**///System.out.println();
	  String Cr[] = new String[N];
	  String C2r[] = new String[N];
	  Cr = BubbleSort(C, N);
	  //if(Cr.equals(C)){
		  System.out.println("Stable");
	  //}
	  //else System.out.println("Not Stable");
	  C2r = SelectionSort(C2, N);
	  if(Arrays.equals(Cr, C2r)){
		  System.out.println("Stable");
	  }
	  else System.out.println("Not stable");
	}
	public static String[] BubbleSort(String[] C, int N){
		for(int i = 0;i < N - 1;i++){
			for(int j = N - 1;j > i;j--){
				if(C[j].charAt(1) < C[j - 1].charAt(1)){
					String tmp = C[j];
					C[j] = C[j - 1];
					C[j - 1] = tmp;
				}
			}
		}
		for(int i = 0;i < N;i++){
			 System.out.print(C[i]);
			 if(i != N - 1) System.out.print(" ");
		}
		System.out.println();
		return C;
	} 
	public static String[] SelectionSort(String[] C, int N){
		for(int i = 0;i < N;i++){
			int minj = i;
			for(int j = i;j < N;j++){
				if(C[j].charAt(1) < C[minj].charAt(1)){
					minj = j;
				}
			}
			String tmp = C[i];
			C[i] = C[minj];
			C[minj] = tmp;
    }
    for(int i = 0;i < N;i++){
      System.out.print(C[i]);
      if(i != N - 1) System.out.print(" ");
   }
   System.out.println();
		return C;
	}
}

