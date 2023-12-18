import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private BufferedReader br;
	private long a,b,c;
	private StringTokenizer st;
	private boolean Istrue;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		new Main().start();
	}
	private void start() throws IOException{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=new StringTokenizer(br.readLine());
		a=Integer.parseInt(st.nextToken());
		b=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		Istrue=false;
		for(long i=1;i<b;i++){
			if((a*i)%b==c){
				Istrue=true;
				break;
			}
		}
		if(Istrue){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
