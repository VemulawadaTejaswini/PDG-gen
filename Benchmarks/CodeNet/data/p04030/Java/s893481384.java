import java.util.*;

class Main{
	public static void main(String[] args){
      String answer = "";
		Scanner scan = new Scanner(System.in);
      	String s = scan.next();
      	 int l = s.length();
     	 String[] moji = new String[];
      for(int i = 0;i < l;i++){
        moji[i]=s.charAt(i);
	}
      for(String　moji :moji){
        boolean is0 = moji.equals("0");
        boolean is1 = moji.equals("1");
        boolean isB = moji.equals("B");
        boolean isAns0 = answer.length()==0;
        
        if(is0){
          answer += "0";
        }else if(is1){
          answer += "1";
        }else if(isB && !isAns0){
          answer = answer.substring(answer.length()-1);
        }
      }
        System.out.println(answer);
}