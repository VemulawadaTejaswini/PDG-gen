import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
		String s1 = s.substring(0,1);
      	String s2 = s.substring(1,2);
      	String s3 = s.substring(2,3);
      	String s4 = s.substring(3,4);
      
      	if(s1==s2 && s3==s4){
          if(s1 != s3){
            System.out.println("Yes");
          }
        }else if(s1==s3 && s2==s4){
          if(s1 != s2){
            System.out.println("Yes");
          }
        }else if(s1==s4 && s2==s3){
          if(s1 != s2){
            System.out.println("Yes");
          }
        }else{
          System.out.println("No");
        } 
	}
}