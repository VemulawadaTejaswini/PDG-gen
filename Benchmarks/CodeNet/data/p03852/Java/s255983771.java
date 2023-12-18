import java.util.*;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String a = sc.next();
      String message ="consonant";
      	String[] list = {"a","i","u","e","o"};
      for(int i =0; i < list.length-1;i++){
      	if(a.equals(list[i])){
        	message = "vowel";
          break;
        }
      }
      System.out.println(message);
      
    }
}
