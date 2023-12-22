import java.io.*;
public class Main {
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] str =  br.readLine().split(" ");
		
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[2]);
		
			if(str[1].equals("+")){
				System.out.println(a+b);
			}else if(str[1].equals("-")){
				System.out.println(a-b);
			}else if(str[1].equals("*")){
				System.out.println(a*b);
			}else if(str[1].equals("/")){
				System.out.println(a/b);
			}else if(str[1].equals("?")){
				break;
			}
		
		}
		
	}
}