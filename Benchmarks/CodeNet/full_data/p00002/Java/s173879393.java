import java.io.*;
import java.util.*;
public class Main {

	public static void main(String []args){

		Scanner sc=new Scanner(System.in);

		while(sc.hasNext()){
			String[] line=sc.nextLine().split(" ");

			int a=Integer.parseInt(line[0]);
			int b=Integer.parseInt(line[1]);

			int sum=a+b;

			System.out.println(String.valueOf(sum).length());
		}

	}
}