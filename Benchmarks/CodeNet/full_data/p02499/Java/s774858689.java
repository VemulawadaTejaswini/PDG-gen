import java.util.Scanner;
public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int [] chars = new int [256];
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			String line2;
			line2 = line.toLowerCase();
			for(int i = 0; i < line2.length(); i++){
				char ch = line2.charAt(i);
				chars[ch]++; 
			}
		}
		for(char ch = 'a'; ch<='z'; ch++){
			System.out.println(ch+" : "+chars[ch]);
		}
	}

}