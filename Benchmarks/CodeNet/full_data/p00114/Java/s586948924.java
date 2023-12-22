import java.io.*;

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

			int j = countLoop(a[0], m[0]);
			int k = countLoop(a[1], m[1]);
			int l = countLoop(a[2], m[2]);
			System.out.println(lcm(lcm(j, k), l));
		}
	}

	public int countLoop(int a, int m){
		int n = 1;
		int count = 0;
		do{
			count++;
			n = (a * n) % m;
		}while(n != 1);

		return count;
	}

	public int lcm(int n, int m){
		int p = n*m;
		int tmp;
		while(m%n != 0){
			tmp = n;
			n = m%n;
			m = (int)tmp;
		}

		return p / n;
	}
}