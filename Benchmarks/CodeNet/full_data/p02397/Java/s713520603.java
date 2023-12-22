import java.io.*;

class main{
	public static void main (String[] args) throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	

		while(true){
		String a = br.readLine();
		String b = br.readLine();

		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);

		if( num1 < num2){
			System.out.println(num1 +" "+ num2);
			
		}

		

		else if(num1 > num2){
			System.out.println(num2 +" "+num1);
			
		}

		else if(num1 == 0 && num2 ==0){
			break;
		}
                }
		
	}
}