import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main{
    public static void main(String[] a){
Scanner file = new Scanner("System.in");
		
		try {
			Scanner input = new Scanner(file);
			String OrigWord = input.nextLine();
			int OrigLen = OrigWord.length(); 
			String NewWord = "";
			for (int x=OrigLen-1; x >= 0; x--){
				
				NewWord = NewWord + (OrigWord.charAt(x)); 
				
			}
			
			
			System.out.println(NewWord);
		}
		catch (IOException ex) {
			System.out.println(ex);
			}
    }
}