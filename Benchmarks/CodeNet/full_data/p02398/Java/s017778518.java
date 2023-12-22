import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] cut = input.split(" ");
		int a =Integer.parseInt(cut[0]);
		int b =Integer.parseInt(cut[1]);
		int c =Integer.parseInt(cut[2]);
		int count=0;
	 for(int x = a;x <= b; x++ ){
		 if(c%x==0){
			 count++;
		 }
	 }
	 System.out.println(count);
	}
}