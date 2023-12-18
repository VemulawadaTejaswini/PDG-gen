import java.util.*;
public class Main{
  public static void main(String[] args){
    	Scanner s = new Scanner(System.in);
    	String word = s.nextLine();
    	int leng = word.length();
    	String re = word.reverse();
    	int c = 0;
    	for(i=leng-1; i<=0; i--){
          if(word.charAt(i) == re.charAt(i)){
            	continues;
          }else
            c++;
        }
    System.out.println(c/2);
  }
}