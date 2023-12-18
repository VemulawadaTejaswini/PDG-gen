import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String a[] = str.split(" ", 0);
		int b[] = new int[3];
		for(int i = 0; i < 3; i++ ){
			b[i] = Integer.parseInt(a[i]);
		}
		if(b[0]%2 == 0 && b[1]%2 == 0 && b[2]%2 == 0){
			System.out.println("0");
		} else {
			if(b[0] >= b[1]){
				if(b[0] >= b[2]){
					System.out.println(b[1]*b[2]);
				} else {
					System.out.println(b[0]*b[1]);
				}
			} else {
				if(b[1] >= b[2]){
					System.out.println(b[1]*b[2]);
				} else {
					System.out.println(b[1]*b[0]);
				}
			}
		}
		
	}
}