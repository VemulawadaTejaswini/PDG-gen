import java.io.BufferedReader;

public class Main {

	public static final int MAXN = 200000;
	public static final int MINN = 2;

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = readInt(r);
		int[] price1 = new int[n];
		for(int i = 0 ; i < n ; i++) {
			price1[i] = readInt(r);
		}

		int max = MINN - MAXN -1;
		for(int y = 0 ; y < n ; y++){
			for(int x = y+1; x < n; x++){
				if(max < price1[x] - price1[y]){
					max = price1[x] - price1[y];
				}
			}
		}
		System.out.println(max);
	}

	public static int readInt(BufferedReader r) throws Exception{
		return Integer.parseInt(r.readLine());
	}

}