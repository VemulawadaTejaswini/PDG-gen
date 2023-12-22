//«®ÅæªÉÈéàÌðoÍ·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String first = sc.next();
		for(int i=1; i< n;i++){
			String temp = sc.next();
			boolean flg  = true;
			for(int j=0;j < first.length() && j < temp.length(); j++){
				if(first.charAt(j) > temp.charAt(j)){
					first = temp;
					flg = false;
					break;
				}
				else if(first.charAt(j) < temp.charAt(j)){
					flg = false;
					break;
				}
				else{}
			}
			if(flg && first.length() > temp.length()){
				first = temp;
			}
		}
		System.out.println(first);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}