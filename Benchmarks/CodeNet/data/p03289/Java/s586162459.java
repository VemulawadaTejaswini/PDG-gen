import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		String s = sc.next();
      	int count =0;
      	int lowerCase =0;
      	for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
              lowerCase++;
            }
          }
      	for (int i = 2; i < s.length() - 1; i++){
          if(s.charAt(i) == 'C'){
            	count++;
      	}
        }
          if((s.charAt(0) == 'A') && (lowerCase == s.length()-2) && count==1){
          	System.out.println("AC");
          }else{
            System.out.println("WA");
          }
    }
}