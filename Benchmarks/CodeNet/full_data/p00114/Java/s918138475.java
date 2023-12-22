import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> Ans = new ArrayList<Integer>();
		String line;

		while((line = in.readLine()) != null){
			int[] x = new int[]{1, 1, 1};
			int[] a = new int[3];
			int[] m = new int[3];
			String[] dst = line.split(" ");

			int end = 0;
			for(int i=0; i<3; i++){
				a[i] = Integer.parseInt(dst[2*i]);
				m[i] = Integer.parseInt(dst[2*i+1]);

				if(a[i] != 0 || m[i] != 0){
					end = 1;
				}
			}

			if(end == 0){
				break;
			}

			int count = 0;
			while(true){
				count++;
				for(int i=0; i<3; i++){
					x[i] = a[i] * x[i] % m[i];
				}

				if(x[0]==1 && x[1]==1 && x[2]==1){
					break;
				}
			}

			Ans.add(count);
		}

		for(int i=0; i<Ans.size(); i++){
			System.out.println(Ans.get(i));
		}
	}
}