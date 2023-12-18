import java.io.BufferedReader;
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
		int[][] x = new int[N][];
		boolean[][] y = new boolean[N][];
		for(int i=0;i<N;i++) {
			strings = readLine();
			int A = Integer.parseInt(strings[0]);
			x[i] = new int[A];
			y[i] = new boolean[A];
			for(int j=0;j<A;j++) {
				strings = readLine();
				x[i][j] = Integer.parseInt(strings[0]);
				y[i][j] = (strings[1].equals("1"));
			}
		}
		
		int max = 0;
		for(int pointer = 0;pointer<Math.pow(2,N);pointer++) {
			boolean succeed = true;
			boolean T[] = new boolean[N];
			int t = 1;
			int cnt = 0;
			for(int i=0;i<N;i++) {
				if((pointer&t)!=0) {
					T[i] = true;
					cnt++;
				}else {
					T[i] = false;
				}
				t*=2;
			}
			if(max>=cnt) {continue;}
			for(int i=0;i<N;i++) {
				if(!T[i]) {continue;}
				for(int j=0;j<x[i].length;j++) {
					if(y[i][j]!=T[x[i][j]-1]) {
						succeed = false;
						break;
					}
				}
				if(!succeed) {break;}
			}
			if(succeed) {max = cnt;}
		}
		
		
		//String[] s = readLine();
		print(max);
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