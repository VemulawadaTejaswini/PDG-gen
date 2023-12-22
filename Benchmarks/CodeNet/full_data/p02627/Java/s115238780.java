import java.util.*;
public class Main {
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   String str = sc.next();
      
      if(Character.isUpperCase(str.charAt(0))){
      	str = str.toLowerCase();
      }else{
        str = str.toUpperCase();
      }
		// 出力
		System.out.println(str);     
	}
}