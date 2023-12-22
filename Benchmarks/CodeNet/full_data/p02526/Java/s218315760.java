import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] s;
		String[] t;
		int n;
		int q;
		int i=0,
			j=0,
			count = 0;
		try{
			line = reader.readLine();
			n = Integer.parseInt(line);
			line = reader.readLine();
			s = line.split(" ");
			line = reader.readLine();
			q = Integer.parseInt(line);
			line = reader.readLine();
			t = line.split(" ");
			for(i=0;i<q;i++){
				for(j=0;j<n;j++){
					if(s[j].equals(t[i])){
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}