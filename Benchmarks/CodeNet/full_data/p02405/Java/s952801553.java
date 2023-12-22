import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		while(!(string = reader.readLine()).equals("0 0")){
			for(int i = 0; i < Integer.parseInt(string.split(" ")[0]); i++){
				for(int j = 0; j < Integer.parseInt(string.split(" ")[1]); j++){
					if(i % 2 == 0){
						if(j % 2 == 0){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}else{
						if(j % 2 == 0){
							System.out.print(".");
						}else{
							System.out.print("#");
						}
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		reader.close();
	}
}