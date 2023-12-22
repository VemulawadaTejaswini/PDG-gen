import java.util.Scanner;
import java.io.*;
public class Main{

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
			while(sc.hasNext()){
				String a=sc.nextLine();
				String b=yms(a);
				if(a.equals(b))count++;
			}
			System.out.println(count);
	}
	public static String yms(String str) {
		  int length=str.length();
		  char[] code=str.toCharArray();
		  
		  for (int i=0; i<length/2;i++) {
		  char temp= code[i];
		   code[i] = code[length-1-i];
		   code[length-1-i]=temp;
		  }
		  String string = "";
		  for (int i=0; i<length;i++)string+=code[i];
		  System.out.println();
		  return string;
		 }
	
}