import java.io.*;

class Main15 {
	public static void main(String[] args){
		int a ;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String buf = br.readLine();
			
			String[] line = buf.split(" ");
			
			int n = Integer.parseInt(buf);
			
			a = Integer.parseInt(line[0]);
			int max = a;
			int min = a;
			int total = a;
			
			for(int i = 1;i < n;i++){
				int b = Integer.parseInt(line[i]);
				if(max<b) max = b;
				if(min>b) min = b;
				total = total + b;
			}
			System.out.println(min+" "+max+" "+total);
		} catch(Exception e){
		}
	}
}