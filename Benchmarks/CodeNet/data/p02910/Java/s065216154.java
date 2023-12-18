import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
      String ans ="";	
      ans = getAns(s);
      System.out.println(ans);
	}
  
  public String getAns(String s){
    String a = "";  
    for(int i=0;i<s.length();i++){
        //奇数番目の文字。iは奇数
        if(i%2==1){
          if(s.equals("L")){
            a = "No";
            return a;
          }else{
          	continue;
          }
        }else{
          if(s.equals("R")){
          	a ="No";
            return a;
          }else{
          	continue;
          }
        }
        a ="Yes";
      return a;
      }
  }
      
}
