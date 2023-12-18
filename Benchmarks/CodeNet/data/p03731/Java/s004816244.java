
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	private BufferedReader br;
	private BufferedWriter bw;
	private StringTokenizer st;
	private int n;
	private int t;
	private int arr[];
	private int count;
	private int runt;
	private int i;
	private int water;
	public static void main(String[] args) throws IOException {
		new Main().start();
	}

	void start() throws IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		n= Integer.parseInt(st.nextToken());
		t= Integer.parseInt(st.nextToken());
		arr=new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}
		count=0;
		runt=t;
		i=1;
		water=0;
		while(true){
			if(i<n){
			if(arr[i]==count){
				runt=t;
			}
			}
			count++;
			if(runt>0){
				water++;
				runt--;
			}
		
			if(i<n){
			while(runt==0&&arr[i]>count){
				count++;
				runt+=t;
				if(arr[i]==count){
					i++;
				}
			}
			}
			
			if(runt==0){
				break;
			}
			
		}
		
		bw.write(String.valueOf(water));
		bw.flush();
		br.close();
		bw.close();
		
		
	}

}
