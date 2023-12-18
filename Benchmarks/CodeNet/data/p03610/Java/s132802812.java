import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String StartString = br.readLine();
		char[]arr = StartString.toCharArray();
		for(int i =0; i<StartString.length(); i++) {
			if(i%2 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println();
	}

}
