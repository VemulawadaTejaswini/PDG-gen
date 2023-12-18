import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		// System.setIn(new FileInputStream("file"));
		try(BufferedReader  kb = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter out = new PrintWriter(System.out)){
			for(String in; (in= kb.readLine())!= null; ){
				long N = Long.parseLong(in.trim());
				long[] arr = new long[(int)N];
				for(long i = 0; i < N ; i++){
					in = kb.readLine().trim();
					arr[(int)i] = Long.parseLong(in);
				}
				out.println(solve(arr));
			}
		}
	}

	static long solve(long[] arr) {
		long a = 0;
		long b = 0;
		for (int i = 0; i < arr.length-1; i++) {
			a+=arr[i]/2;
			if(arr[i]%2!=0 && arr[i+1]!=0){
				a+=1;
				arr[i+1]--;
			}
		}
		a+=arr[arr.length-1]/2;
//		for (int i = arr.length-1; i > 0; i--) {
//			b+=arr[i]/2;
//			if(arr[i]%2!=0 && arr[i-1]!=0){
//				b+=1;
//				arr[i-1]--;
//			}
//		}
		return a;
	}
}