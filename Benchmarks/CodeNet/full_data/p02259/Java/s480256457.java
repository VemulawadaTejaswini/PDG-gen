import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static void print(int[] A){
		String[] V=new String[A.length];
		for(int i=0;i<A.length;i++){
			V[i]=String.valueOf(A[i]);
		}
		System.out.println(String.join(" ",V));
	}
	
	private static void BubbleSort(int[] A){
	 int store=0;
	 for(int i = 0;i<=A.length-1;i++){
	     for(int j = A.length-1;j>=i+1;j--){
	         if(A[j] < A[j-1]){
	             int w=A[j];
	             A[j]=A[j-1];
	             A[j-1]=w;
	             store++;
	         }
	     }
	 }
	 print(A);
	 System.out.println(store);
	}
	
	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            line=br.readLine();
            line=br.readLine();
            String[] str=line.split(" ");
            int[] A=new int[str.length];
            for(int i=0;i<A.length;i++){
            	A[i]=Integer.parseInt(str[i]);
            }
            BubbleSort(A);
        }
	}
}