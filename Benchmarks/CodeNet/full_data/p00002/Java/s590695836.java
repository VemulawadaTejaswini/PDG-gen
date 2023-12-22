import java.io.*;

class Main{
	public static void main(String args[]){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String input="";
			try{
				input = reader.readLine();
			}catch(IOException e){
				
			}
			if(input==null){
				break;
			}
			
			String array[] = input.split(" ");
			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			int num = a+b;
			int cou=0;
			while(num>0){
				num/=10;
				cou++;	
			}
			System.out.println(cou);
		}
	}
}