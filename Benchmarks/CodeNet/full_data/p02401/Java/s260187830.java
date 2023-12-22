import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean cont=true;
		while(cont){
			String[] ary = br.readLine().split(" ");
	        int a = Integer.parseInt(ary[0]);
	        int b = Integer.parseInt(ary[2]);
	        switch(ary[1].charAt(0)){
	        case '+':
	        	sb.append(a+b+"\n");
	        	break;
	        case '-':
	        	sb.append(a-b+"\n");
	        	break;
	        case '*':
	        	sb.append(a*b+"\n");
	        	break;
	        case '/':
	        	sb.append(a/b+"\n");
	        	break;
	        default:
	        	System.out.print(sb);
	        	cont=false;
	        	break;
	        }
		}
	}
}