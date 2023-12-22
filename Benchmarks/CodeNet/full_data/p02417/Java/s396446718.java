import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String str;
		byte[] asci;
		int[] count = new int[26];
		//char[] c = str.toCharArray();
		//int[] count = new int[c.length];
		
		
		while(true){
			str = buf.readLine();
			if(str.length() == 0) 
				break;
			asci = str.getBytes("US-ASCII");
			for(int i=0; i<26; i++){
				for(int j=0; j<asci.length; j++){
					if(asci[j] == 65+i || asci[j] == 97+i){
						count[i]++;
					}
				}
			}
			for(int i=0; i<26; i++){
				System.out.println((char)(97+i) + " : " + count[i]);
			}	
		}	
	}
}