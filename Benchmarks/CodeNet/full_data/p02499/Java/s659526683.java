import java.io.*;
import java.util.Scanner;

class Main{
	
	public static void main(String args[]) throws IOException{
		String words = new String();
		int num=0;
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			String buf = in.nextLine();
			words = words + buf;
		}
		
		words = words.toLowerCase();
		
		for(char i='a'; i<= 'z';i++){
			for(int j=0;j<words.length();j++){
				if(i == words.charAt(j)){
					num++;
				}
			}
			
			System.out.println(i+" : "+num);
			
			num=0;
		}
	}
}