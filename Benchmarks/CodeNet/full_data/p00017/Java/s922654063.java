import java.util.Scanner; 
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.next();
			for(int i = 0 ; i < str.length();i++){
				if(str.charAt(i)<68)
					System.out.print((char)(str.charAt(i)+25));
				else
					System.out.print((char)(str.charAt(i)-1));
			}
		}
		System.out.println("");
	}
}