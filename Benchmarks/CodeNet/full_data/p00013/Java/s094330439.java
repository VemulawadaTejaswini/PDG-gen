import java.util.*;
public class Main {
	
	static void aryExchng(int[] a,int[] b){
		for(int i=0; i < ((a.length > b.length) ? b.length:a.length); i++){
			int t = a[i];
			a[i] = b[i];
			b[i] = t;
		}
	}
	
	//[配列]の[idx]箇所を削除して、前に詰めた配列を返却.要素数が減る.
		static int[] arrayRmvOf(int[] a, int idx){
			aryRmv(a,idx);
			int[] temp = new int[a.length-1];
			aryExchng(a,temp);
			return temp;
		}
		
		static void aryRmv(int[] a, int idx){
			for(int i=idx; i<a.length-1; i++){
				a[i] = a[i+1];
			}
			a[a.length-1] = 0;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] read = new int[100];
		int i = 0;
		while(sc.hasNext())	read[i++] = sc.nextInt();
		int[] a = new int[i];
		aryExchng(read,a);
		
		for(int j=0; j<a.length; j++){
			if(a[j] == 0){
				System.out.println(a[j-1]);
				a = arrayRmvOf(arrayRmvOf(a,j-1),j-1);
				j = -1; continue;
			}
				
		}			
			
	}		
}