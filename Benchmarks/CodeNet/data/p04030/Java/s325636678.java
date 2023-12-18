import java.util.*;
 
class Main{
	public static void main(String[] args){
      String answer = "";
		Scanner scan = new Scanner(System.in);
      	String s = scan.next();
      	 int l = s.length();
     	 String[] moji = new String[l];
      for(int i = 0;i < l;i++){
        moji[i]=String.valueOf(s.charAt(i));
	}
      for(String moj : moji){
        boolean is0 = moj.equals("0");
        boolean is1 = moj.equals("1");
        boolean isB = moj.equals("B");
        boolean isAns0 = answer.length()==0;
        
        if(is0){
          answer += "0";
        }else if(is1){
          answer += "1";
        }else if(isB && !isAns0){
          String t = answer;
          answer = answer.substring(0,t.length()-1);
        }
      }
        System.out.println(answer);
}
}