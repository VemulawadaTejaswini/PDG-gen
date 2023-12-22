import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args)throws IOException {
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		 String[] aaa = str.split(" ");
			
		 int count = aaa.length;
		 int[] bbb = new int[count];
		 
		 for(int i = 0; i < bbb.length;i++) {
			 bbb[i] = Integer.parseInt(aaa[i]);
		 }
		 
		 if(bbb[0]>= (bbb[2]+bbb[4]) && (bbb[2]-bbb[4]) >=0) {
			 if(bbb[1]>=(bbb[3]+bbb[4]) && (bbb[3]-bbb[4])>=0) {
				 System.out.println("Yes");
			 }
			 else {
				 System.out.println("No");
			 }
		 }
		 else {
			 System.out.println("No");
		 }
	}
}