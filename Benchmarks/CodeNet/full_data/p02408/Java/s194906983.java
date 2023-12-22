import java.io.*;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str=input.readLine();
		int n=Integer.parseInt(str);
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			list.add(input.readLine());
		}
		for(int i=1;i<14;i++){
			if(list.contains("S ")==false&&list.contains(i));
			System.out.println("S"+" "+i);
		}
		for(int i=1;i<14;i++){
			if(list.contains("H ")==false&&list.contains(i));
			System.out.println("H"+" "+i);
		}
		for(int i=1;i<14;i++){
			if(list.contains("C ")==false&&list.contains(i));
			System.out.println("C"+" "+i);
		}
		for(int i=1;i<14;i++){
			if(list.contains("D ")==false&&list.contains(i));
			System.out.println("D"+" "+i);
		}
	}
}