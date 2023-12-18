import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] a = new char[s.length()];
		for(int i = 0; i < s.length(); i++){
		    a[i] = s.charAt(i);
		    if(a[i] == 'B'){
		        a[i] = ' ';
		        if(i != 0){
		            a[i - 1] = ' ';
		        }
		    }
		}
		for(int i = 0; i < s.length(); i++){
		    if(a[i] != ' '){
		        System.out.print(a[i]);
		    }
		}
	}
}