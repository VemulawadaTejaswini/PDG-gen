import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int A_size;
			
			while(true){
				/* input from here */
				String line = r.readLine();
				A_size = Integer.parseInt(line);
				long[] A = new long[A_size];
				if(A_size==0){
					break;
				} else {				
					String[] temp = r.readLine().split(" ");
					for(int i=0;i<A_size;i++){
						A[i] = Long.parseLong(temp[i]);
					}
				}
				/* input till here */
				/* processing from here */
				//array to store count of each input integer
				ArrayList<Long> num = new ArrayList<Long>();
				ArrayList<Integer> count = new ArrayList<Integer>();
				for(int i=0;i<A_size;i++){
					if(num.contains(A[i])){
						count.set(num.indexOf(A[i]), count.get(num.indexOf(A[i]))+1);
					} else {
						num.add(A[i]);
						count.add(1);
					}
				}
				
				/* processing till here */
				/* output */
				boolean nosol = true;
				for(int i=0;i<count.size();i++){
					if(count.get(i) > A_size/2){
						System.out.println(num.get(i));
						nosol = false;
						break;
					}
				}
				if(nosol){
					System.out.println("NO COLOR");
				}		
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}