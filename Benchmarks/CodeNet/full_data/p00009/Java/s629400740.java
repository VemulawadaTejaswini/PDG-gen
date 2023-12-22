import java.io.*;

public class Main{
	
	public static void main(String[] argv) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null){
			int n = Integer.parseInt(line);
			int num = 0;
			boolean flag;
			for(int i=2; i<=n; i++){
				if(i != 2 && i%2 == 0)continue;
				flag = true;
				for(int j=2; j<Math.sqrt(i)+1; j++){
					if(i != j && i % j == 0){
						flag = false;
						break;
					}
				}
				if(flag){
					num++;
				}
			}
			System.out.print(Integer.toString(num)+"\n");
		}
	}
}