import java.io.IOException;
import java.util.Scanner;

public class Main {

public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
  		String t = scan.next();
  	int cnt = 0;
  		for(int i=0; i<s.length(); i++){
          if(s.charAt(i) != t.charAt(i)){
            cnt++;
          }
          
        }
  
		System.out.println(cnt);
}
}
