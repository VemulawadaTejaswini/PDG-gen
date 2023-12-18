import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String po[] = br.readLine().split(" ",0);
		int[] d = new int[3];
		for(int i = 0; i < 3; i++){
			d[i] = Integer.parseInt(po[i]);
		}
		if(d[0]%2 == 0 || d[1]%2 == 0 || d[2]%2 ==  0){
			System.out.println("0");
		}else if(d[0] > d[1]){
			if(d[0] > d[2]){
				System.out.println(d[1]*d[2]);
			} else {
				System.out.println(d[1]*d[0]);	
			}
		} else {
			if(d[1] > d[2]) {
				System.out.println(d[0]*d[2]);
			} else {
				System.out.println(d[0]*d[1]);
			}
		}
	}
}