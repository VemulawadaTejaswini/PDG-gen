	import java.io.*; 
public class Main {
	public static void main(String[] arg)throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] hairetu = str.split(" ");
		while (hairetu != null){
		int a = Integer.parseInt(hairetu[0]); 
		int b = Integer.parseInt(hairetu[1]); 
		int c = a+b;
		int k = 0;
		while (c>0){
			if (c>0){
				c = (int)(c/10);
				k = k+1;
			}

		}
		System.out.println(k);
		 str = br.readLine();
		}
	}

}