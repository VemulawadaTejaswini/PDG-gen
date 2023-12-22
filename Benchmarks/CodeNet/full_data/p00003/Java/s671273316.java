import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
		//System.out.println("Hello world");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br =new  BufferedReader(is);

		String c = br.readLine();
		int n1 = Integer.parseInt(c);
		int[] n = new int[3];

		for(int j = 0; j <n1; j++){
			String str = br.readLine();
			int space1 = str.indexOf(" ");
			int space2 = str.indexOf(" ", space1+1);
			String str1 = str.substring(0, space1);
			String str2 = str.substring(space1+1, space2);
			String str3 = str.substring(space2+1, str.length());
			n[0] = Integer.parseInt(str1);
			n[1] = Integer.parseInt(str2);
			n[2] = Integer.parseInt(str3);

			int[] max = new int[3];
			max[2] = n[0];
			for(int i = 0; i <3; i++){
				if(max[2] <= n[i]){
					max[2] = n[i];
					if(max[2] >= max[1]){
						int re = max[1];
						max[1] = max[2];
						max[2] = re;
						if(max[1] >= max[0]){
							int re2 = max[0];
							max[0] = max[1];
							max[1] = re2;
						}
					}
				}

			}
			if(max[0]*max[0] == max[1]*max[1] + max[2]*max[2])
				System.out.println("YES");
			else
				System.out.println("NO");

		}




	}

}