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
	
	public static void selectionSort(int[] A){ // N??????????´??????????0-?????????????????????
		int store=0;
		for(int i =0;i< A.length;i++){
			int mini = i;
			for(int j = i;j< A.length;j++){
				 if(A[j] < A[mini]){
					 mini = j;
				 }
			}
			if(mini!=i){
				store++;
				int w=A[i];
				A[i]=A[mini];
				A[mini]=w;
			}
		}
		print(A);
		System.out.println(store);
	}
	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	int[] A=new int[Integer.parseInt(line)];
            	line=br.readLine();
            	String[] str=line.split(" ");
            	for(int i=0;i<A.length;i++){
            		A[i]=Integer.parseInt(str[i]);
            	}
            	selectionSort(A);
            	break;
            }
        }
	}

}