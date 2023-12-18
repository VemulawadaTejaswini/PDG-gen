import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
	char key[] = {'k','e','y','e','n','c','e'};
    int key_count = 0;
    int st_count;
    int el = 0;
    boolean con = true;
    boolean con2;
    if(s.charAt(0) != 'k') con = false;
    
    for(int i = 0;i < s.length() && con; i++){
    	if(s.charAt(i) == key[key_count] && el == 0) {
          key_count++;
          if(key_count == 7) con = false;
        } else if(el == 0) el = 1;
      	else if(s.charAt(i) == key[key_count]){
          st_count = key_count;
          con2 = true;
          for(int j = 0; j < 7-key_count && con2 && i+j < s.length();j++){
          	if(s.charAt(i+j) == key[st_count]) st_count++;
            else con2 = false;
            if(st_count == 7){
              key_count = st_count;
              con = false;
            }
          } 
        }
      	
    }
     	
    if(key_count == 7) System.out.println("YES");
  	else System.out.println("NO");
  }
}
