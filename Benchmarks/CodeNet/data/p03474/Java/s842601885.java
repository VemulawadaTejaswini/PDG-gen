import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      //値取得
	  int A = sc.nextInt();
      int B = sc.nextInt();
      String S = sc.next();
      
      Pattern p = Pattern.compile("^[0-9]{A}-[0-9]{B}$");
      Matcher m = p.matcher(str);
      
      if(m.find()){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}