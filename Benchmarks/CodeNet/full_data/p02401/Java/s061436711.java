import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str=br.readLine();
			String[] num=str.split(" ");
			int a=Integer.parseInt(num[0]);
			String op=num[1];
			int b=Integer.parseInt(num[2]);
			
			if(op.equals("+")){
				System.out.println(a+b);
			}
			else if(op.equals("-")){
				System.out.println(a-b);
			}
			else if(op.equals("*")){
				System.out.println(a*b);
			}
			else if(op.equals("/")){
				System.out.println(a/b);
			}
			else{
				break;
			}
		}
	}
}