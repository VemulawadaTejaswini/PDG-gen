import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private BufferedReader br;
	private int n,count;
	private StringTokenizer st;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		new Main().start();
	}
	public void start()throws IOException{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		for(int i=1;i<=100;i++){
			count+=i;
			if(count>n){
				System.out.println(count-n);
				break;
			}
		}
		br.close();
	}
}
