import java.util.*;

public class Main{
  
  public static void main(String[] args){
	  final String REGEX = "ABC";
	  int count = 0;
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("文字数を入力してください。");
	  int stringLength = scanner.nextInt();
	  System.out.println("文字列を入力してください。");
	  String targetStrings = scanner.next().toUpperCase();
	   for(int i=0;i<targetStrings.length()-2;i++){
		      if(targetStrings.substring(i,i+3).equals("ABC")){
		        count++;
		      }
		    }
	  System.out.println(count);
	  
  }
}