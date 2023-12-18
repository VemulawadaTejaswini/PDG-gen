import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
      String ans ="";	
      ans = getAns(s);
      System.out.println(ans);
	}
  
  public static String getAns(String s){
    String a = "";  
    for(int i=0;i<s.length();i++){
      String t = s.substring(i,i+1) ; 
      //奇数番目の文字。iは偶数
        if(i%2==0){
          if(t.equals("L")){
            a = "No";
            return a;
          }/*else{
          	continue;
          }*/
        }else{
          if(t.equals("R")){
          	a ="No";
            return a;
          }/*else{
          	continue;
          }*/
        }  
      }
    a ="Yes";
      return a;
  }
      
}
