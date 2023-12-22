import java.io.*;
import java.util.Scanner;
public class SimpleCal {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner br =new Scanner(System.in);
		int a,b,num=0;
		String op="a";
		while(true){
		a=br.nextInt();
		op=reader.readLine();
		b=br.nextInt();
			if(op.equals("+")){
				num=a+b;
				System.out.println(num);
			}else if(op.equals("-")){
				num=a-b;
				System.out.println(num);
			}else if(op.equals("*")){
				num=a*b;
				System.out.println(num);
			}else if(op.equals("/")){
				num=a/b;
				System.out.println(num);
			}else{
				break;
			}
			}
		}
	}