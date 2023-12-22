import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
	public static void main(String[] args){
	int i = 1;
	//int[] x = new int[10000];
		while(i>0){
			BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
			String text = in.readLine();
			int x = Integer.parseInt(text);
			
			
			
			if(x == 0){
				break;
			}
			else{
				System.out.println("Case "+i+": "+x);
			}
		}
	}
}