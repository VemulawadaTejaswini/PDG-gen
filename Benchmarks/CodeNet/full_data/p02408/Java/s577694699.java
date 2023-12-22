import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		int n;
		
		int rank;
		
		boolean[] S = new boolean[14];
		boolean[] H = new boolean[14];
		boolean[] C = new boolean[14];
		boolean[] D = new boolean[14];
		
		for(int i=0;i<13;i++){
			S[i]= H[i]= C[i]= D[i]= false;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			
			String[] imp = br.readLine().split(" ");
			rank = Integer.parseInt(imp[1]);
			
			if("S".equals(imp[0])){
				S[rank]=true;
			}else if("H".equals(imp[0])){
				H[rank]=true;
			}else if("C".equals(imp[0])){
				C[rank]=true;
			}else if("D".equals(imp[0])){
				D[rank]=true;
			}
		}
			for(int j=1;j<14;j++){
				if(S[j]==false){
				System.out.println("S "+j);
				}
			}
			for(int j=1;j<14;j++){
				if(H[j]==false){
				System.out.println("H "+j);
				}
			}
			for(int j=1;j<14;j++){
				if(C[j]==false){
				System.out.println("C "+j);
				}
			}
			for(int j=1;j<14;j++){
				if(D[j]==false){
				System.out.println("D "+j);
				}
			}
			
				
			}
			
			
		}
		