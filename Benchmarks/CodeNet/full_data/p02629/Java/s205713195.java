import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
      	Scanner scan = new Scanner(System.in);
	    long n = scan.nextLong();
        long[] array = new long[6];
      String[] arpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
      
      int cnt = 0;
      String ans = "";
      	while(1==1){
          array[cnt] = n % 26;
          if( n<26 ){
            break;
          }
          n = n / 26;
         cnt++;
        }

		for(int i=cnt; i>=0; i--){
          int temp = (int)array[i]-1;
          ans = ans + arpha[temp];
		}
      System.out.println(ans);
 
	}
}