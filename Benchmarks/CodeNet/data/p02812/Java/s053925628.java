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
	  if (!parameterCheck(stringLength,targetStrings)) {
		System.out.println("文字数が合いません。再度入力してください。");
		targetStrings = scanner.next();
	}
	   for(int i=0;i<targetStrings.length()-2;i++){
		      if(targetStrings.substring(i,i+3).equals("ABC")){
		        count++;
		      }
		    }
	  System.out.println(count);
	  
  }

private static boolean parameterCheck(int stringLength, String targetStrings) {
	if (stringLength != targetStrings.length()) {
		return false;
	}else {
		return true;
	}
}
}