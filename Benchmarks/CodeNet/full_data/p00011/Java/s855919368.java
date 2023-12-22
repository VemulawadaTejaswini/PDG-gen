import java.io.*;

class Main{
	public static void main(String[] argv) throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int lineNum = Integer.parseInt(br.readLine());
		int[] lines = new int[lineNum];
		for(int i=0; i<lineNum; i++){
			lines[i] = i+1;
		}
		
		int excNum = Integer.parseInt(br.readLine());
		for(int i=0; i<excNum; i++){
			String[] e = br.readLine().split(",");
			int tmp = lines[Integer.parseInt(e[0])-1];
			lines[Integer.parseInt(e[0])-1] = lines[Integer.parseInt(e[1])-1];
			lines[Integer.parseInt(e[1])-1] = tmp;
		}
		
		for(int i : lines){
			System.out.println(i);
		}
	}
}