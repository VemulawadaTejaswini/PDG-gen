import java.util.Scanner;
import java.util.regex.Pattern;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    if(!scan.hasNextInt()){
    	System.out.print("1番目には数字を入力してください");
      	return;
    }
    int a = scan.nextInt();
    if(!scan.hasNext()){
    	System.out.print("2番目には文字列を入力してください");
      	return;
    }
    String s = scan.next();
    if(s.length()<1 || s.length()>10){
    	System.out.print("2番目に長さ1以上10以下の文字列です");
      	return;
    }
    if(!Pattern.matches("^[a-z]+$", s)){
    	System.out.print("2番目には英子文字です");
      	return;    	
    }
    if(a>=3200){
      System.out.println(s);
    }
    else{
      System.out.println("red");
    }
  }
}