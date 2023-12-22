import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final String key = br.readLine();
		int count = 0;
		loop:
		while(true){
			final String[] strs = br.readLine().split(" ");
			for(int i = 0; i < strs.length; i++){
			    final String str = strs[i];
				if(str.equals("END_OF_TEXT")){
					break loop;
				} else if(str.equalsIgnoreCase(key)){
					count++; 
				}
			}
		}
		System.out.println(count);
	}
}