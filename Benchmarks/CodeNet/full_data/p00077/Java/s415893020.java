
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			int len = str.length();
			for(int i=0; i < len; i++){
				char now = str.charAt(i);
				if(now != '@'){
					System.out.print(now);
				}
				else{
					i++;
					int num = str.charAt(i)  - '0';
					i++;
					if(0 <= num && num <= 9){
						now = str.charAt(i);
						for(int j=0; j < num; j++){
							System.out.print(now);
						}
					}
				}

			}
			System.out.println("");
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}