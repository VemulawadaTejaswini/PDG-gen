import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		String[] s = readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		boolean[] dislike = new boolean[M];
		for(int i=0;i<N;i++){
			String[] st = readLine().split(" ");
			boolean[] l_tmp = new boolean[M];
			int ki = Integer.parseInt(st[0]);
			for(int j=0;j<ki;j++){
				l_tmp[Integer.parseInt(st[j+1])-1] = true;
			}
			for(int j=0;j<M;j++){
				if(!l_tmp[j]){dislike[j]=true;}
			}
			
		}
		int cnt = 0;
		for(int i=0;i<M;i++){
			if(!dislike[i]){
				cnt++;
			}
		}
		System.out.println(cnt);
		return;
	}

	private static String readLine(){
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}