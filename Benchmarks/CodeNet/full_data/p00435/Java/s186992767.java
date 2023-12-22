import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Main app = new Main();
		while(scan.hasNext()){
			String cipher = scan.nextLine();
			System.out.println(app.decipher(cipher));
		}
	}
	
	public String decipher(String cipher){
		String str = "";
		for(int i=0;i<cipher.length();i++){
			char ch = cipher.charAt(i);
			if('A'<=ch && ch<'X'){
				str = str + (char)(ch+3);
			}else if('X'<=ch && ch<='Z'){
				str = str + (char)(ch-23);
			}else{
				str += ch;
			}
		}
		
		return str;
	}
}