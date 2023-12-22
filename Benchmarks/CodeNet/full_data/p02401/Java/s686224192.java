import java.io.*;
  
class Main{
	public static void main(String[] args) throws IOException{

		int x,y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){

			String str[] = br.readLine().split(" ");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[2]);
			
			if(str[1].equals("+")){
			 	System.out.println(x + y);
			}else if(str[1].equals("-")){
				System.out.println(x - y);
			}else if(str[1].equals("*")){
			 	System.out.println(x * y);
			}else if(str[1].equals("/")){
				System.out.println(x / y);
			}else if(str[1].equals("?")){
				 break;
			}
		}
  	}
}