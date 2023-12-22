import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String line = in.nextLine();
			String decrypted = " ";
			for(int k = 0; k < 26; k++){
				decrypted = " ";
				for(int i = 0; i < line.length(); i++){
					char e = line.charAt(i);
					if(e != ' ' && e != '.'){
						char d = (char)((((e - 'a') + k) % 26) + 'a');
						decrypted += d;
					}
					else{
						decrypted += e;
					}
				}
				decrypted += ' ';
				if(decrypted.contains(" this ") || decrypted.contains(" that ") || decrypted.contains(" the ") ||
						decrypted.contains(" this. ") || decrypted.contains(" that. ") || decrypted.contains(" the. ")){
					break;
				}
			}
			//fix the extra spaces
			System.out.println(decrypted.substring(1, decrypted.length() - 1));
		}
	}

}