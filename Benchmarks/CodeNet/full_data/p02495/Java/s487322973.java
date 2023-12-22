import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try{
			while((line = br.readLine() ) != null){
				String[] sl = line.split(" ");
				int a = Integer.parseInt(sl[0]);
				int b = Integer.parseInt(sl[1]);
				if(a==0&&b==0){
					break;
				}
				for(int i=0;i<a;i++){
					for(int j=0;j<b;j++){
						if((i+j)%2==0)System.out.print("#");
						else System.out.print(".");
					}System.out.println();
				}
				System.out.println();
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}