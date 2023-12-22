import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();
		
		while(true){
		String input = br.readLine();
		String[] cut = input.split(" ");
		int a = Integer.parseInt(cut[0]);
		int b = Integer.parseInt(cut[2]);
		String op = cut[1];
		int r=0;
		if(op.equals("?")){break;}
		if(op.equals("+")){r=a+b;}
		if(op.equals("-")){r=a-b;}
		if(op.equals("*")){r=a*b;}
		if(op.equals("/")){r=a/b;}
		sb.append(r).append("\n");
		}
	System.out.println(sb);
		
	}
}