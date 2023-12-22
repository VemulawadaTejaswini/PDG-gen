import java.io.*;

class Main {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			String buf = br.readLine();
			String[] line = buf.split(" ");
			int a = Integer.parseInt(line[0]);
			long max = a;
			long min = a;
			long total = a;
			for(int i = 1;i < n;i++){
				int b = Integer.parseInt(line[i]);
				if(max<b) max = b;
				if(min>b) min = b;
				total = total + b;
			}
			System.out.print(min+" "+max+" "+total);
			System.out.print("\n");
		} catch(Exception e){
		}
	}
}