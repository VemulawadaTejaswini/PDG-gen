import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	int cake[] = new int[16];
	public static void main(String args[]){
		boolean message = true;
		int a,b;

		try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String[] line = br.readLine().split(" ");

				a = Integer.parseInt(line[0]);
				b = Integer.parseInt(line[1]);

				if((a<1) && (a >16)){
					message = false;
				}else if ((b<1) && (b >16)){
					message = false;
				}else if (a>8 ||b>8){
					message =false;

				}


				if(message){
					System.out.println("Yay!");
				}else{
					System.out.println(":(");
				}
		}catch(Exception e){

		}
	}

}
