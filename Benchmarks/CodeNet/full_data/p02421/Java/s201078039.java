import java.io.*;

class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buf.readLine());
		String[] str;
		int tarou=0;
		int hanako=0;
		for(int i=0; i<n; i++){
			str = buf.readLine().split(" ");
			if(str[0].compareTo(str[1]) > 0)
				tarou += 3;
			else if(str[0].compareTo(str[1]) < 0)
				hanako += 3;
			else {
				tarou++;
				hanako++;
			}
		}
		System.out.println(tarou + " " + hanako);
	}
}