import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{


	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
			int n=scan.nextInt();

			String s=reader.readLine();
			String[] str =s.split(" ");
			int array_num[]= new int[n];
			long max, min, sum;
			sum=0;
			max=Integer.MIN_VALUE;
			min=Integer.MAX_VALUE;

		
			System.out.println(min+" "+max+" "+sum);



			scan.close();
			reader.close();
		}catch(IOException e){
			System.out.println("??¨??????:"+e);

		}

	}

}