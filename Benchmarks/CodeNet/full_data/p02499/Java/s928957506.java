//eAt@xbgÌð¦évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		//zñðè`
		int [] charCount = new int[26];
		while(sc.hasNext()){
			String str = sc.nextLine();
			int len = str.length();
			for(int i=0; i< len ;i++){
				int c = Character.toLowerCase(str.charAt(i)) - 'a';
				if(0 <= c &&  c <= 25){
					charCount[c]++;
				}
			}
		}

		//oÍ
		for(int i=0;i<26;i++){
			System.out.printf("%c : %d\n",i+'a', charCount[i]);
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}