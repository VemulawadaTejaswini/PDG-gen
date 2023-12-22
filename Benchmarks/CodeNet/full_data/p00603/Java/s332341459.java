import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
		try {
			String line;
			while((line = br.readLine())!=null){
				int n = Integer.parseInt(line.split(" ")[0]), r = Integer.parseInt(line.split(" ")[1]);

				//input shuffle numbers
				int[] c = new int[r];
				line = br.readLine();
				String[] l = line.split(" ");
				for(int i=0;i<r;i++){
					c[i] = Integer.parseInt(l[i]);
				}
				
				//prepare deck
				ArrayList<Integer> A = new ArrayList<Integer>();
				ArrayList<Integer> B = new ArrayList<Integer>();
				ArrayList<Integer> C = new ArrayList<Integer>();
				int k;
				for(k=0;k<n;k++){
					C.add(k);
				}
				
				//shuffle
				for(int i=0;i<r;i++){
					//split deck
					for(k=0;k<n/2;k++){
						B.add(C.get(0));
						C.remove(0);
					}
					for(;k<n;k++){
						A.add(C.get(0));
						C.remove(0);
					}					
					
					while(A.size()>0||B.size()>0){
						for(int j=0;j<c[i]&&A.size()>0;j++){
							C.add(A.get(0));
							A.remove(0);
						}
						for(int j=0;j<c[i]&&B.size()>0;j++){
							C.add(B.get(0));
							B.remove(0);
						}
					}
				}
				
				System.out.println(C.get(C.size()-1));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}