import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
	/*	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String f = r.readLine();
		int a = Integer.parseInt(f);
		int d = 1;
		if(a == 0){
			return;
		}else{
			System.out.println("Case "+d+": "+a);
			d++;
			while(a > 1){
				BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
				String wf= r.readLine();
				int q = Integer.parseInt(wf);
				System.out.println("Case "+d+": "+q);
				d++;
			}
		}*/
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int d = 1;
		if(b == 0){
			return;
		}else{
			System.out.println("Case "+d+": "+b);
			b = a.nextInt();
			d++;
			while(b >0){
				System.out.println("Case "+d+": "+b);
				b = a.nextInt();
				d++;
			}
		}
	}

}