import java.io.*;

public class Main{
public static void main(String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true){
		String[] str = br.readLine().split(" ");
		int m = Integer.parseInt(str[0]);
		int f = Integer.parseInt(str[1]);
		int r = Integer.parseInt(str[2]);
		if(m == -1 && f == -1 && r == -1){
			break;
		}
		
		if ( m == -1 || f == -1){
			System.out.println("F");
		}else if (m + f >= 80){
			System.out.println("A");
		}else if (m + f >= 65){
			System.out.println("B");
		}else if (m + f >= 50){
			System.out.println("C");
		}else if (m + f >= 30){
			if (f >= 50){
				System.out.println("C");
			}else{
				System.out.println("D");
			}
		}else{
			System.out.println("F");
		}
	}
}
}