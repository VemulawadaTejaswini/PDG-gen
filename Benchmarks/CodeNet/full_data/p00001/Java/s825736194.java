import java.io.*;

class v0n0001 {
	public static void main(String[] args) throws IOException{
		
		
		int top = 0;
		int second = 0;
		int third = 0;
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int i = 0; i < 10; i++){

		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		

		if(top < num){
			second = top;
			third = second;
			top = num;
		}
			
		else if(second < num){
			third = second;
			second = num;
		}
		
		else if(third < num)
			third = num;
		
		}

		System.out.println(top + "\n" + second + "\n" + third);
		
		}
	}
	