import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder(br.readLine());
        int q=Integer.parseInt(br.readLine());
        String[] op;
        int op1,op2;
		for(int i=0;i<q;i++){
	        op=br.readLine().split(" ");
			op1=Integer.parseInt(op[1]);
			op2=Integer.parseInt(op[2]);
			if(op[0].equals("print")){
				System.out.println(sb);
			}else if(op[0].equals("reverse")){
				sb=sb.replace(op1,op2+1,new StringBuilder(sb.substring(op1,op2+1)).reverse().toString());
			}else if(op[0].equals("replace")){
				sb=sb.replace(op1,op2+1,op[3]);
			}
		}
	}
}