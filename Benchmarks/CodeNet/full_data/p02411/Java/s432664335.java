import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = reader.readLine();
			String[] sarray = line.split(" ", -1);
			int m = Integer.parseInt(sarray[0]);
			int f = Integer.parseInt(sarray[1]);
			int r = Integer.parseInt(sarray[2]);
			
			if(m == -1 || f == -1){
				if(m == -1 && f == -1){
					break;
				}else{
					System.out.println("F");
				}
			}else{
				if((m + f) >= 80){
				System.out.println("A");
				}
				if((m + f) >= 65 && (m + f) < 80){
					System.out.println("B");
				}
				if((m + f) >= 50 && (m + f) < 65){
					System.out.println("C");
				}
				if((m + f) >= 30 && (m + f) < 50){
					if(r >= 50){
						System.out.println("C");
					}else{
						System.out.println("D");
					}
				}
				if((m + f) >= 0 && (m + f) < 30){
					System.out.println("F");
				}
			}
		}
	}
}