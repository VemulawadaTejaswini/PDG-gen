
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			boolean flg = false;
			String [] str = sc.nextLine().split(" ");
			for(int i=0; i < 26; i++){
				for(int j=0; j < str.length; j++){
					char [] c = str[j].toCharArray();
					for(int k = 0; k < c.length; k++){
						if(c[k] >= 'a' && c[k]<='z'){
							c[k] = (char)((c[k] - 'a' + 1)%26 +'a');
						}
					}
					str[j] = new String(c);
					if(str[j].equals("this") ||str[j].equals("the") ||str[j].equals("that")){
						flg = true;
					}
				}
				if(flg){
					break;
				}
			}
			for(int i=0; i < str.length-1; i++){
				System.out.print(str[i] + " ");
			}
			System.out.println(str[str.length -1]);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}