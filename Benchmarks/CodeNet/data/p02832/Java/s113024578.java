import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		String[] strings = readLine();
		int N = Integer.parseInt(strings[0]);
		int[] A = new int[N];
		strings = readLine();
		for(int i=0;i<N;i++) {
			A[i]= Integer.parseInt(strings[i])-1;
		}
		int cnt = 0;
		for(int i=0;i<N;i++) {
			if(A[i]==cnt) {
				cnt++;
			}
		}
		if(cnt==0) {
			print(-1);
		}else {
			print(N-cnt);
		}
		
		//String[] s = readLine();
		//print(num);
	}
	
	//functions here
	//note that all methods should be STATIC

	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}