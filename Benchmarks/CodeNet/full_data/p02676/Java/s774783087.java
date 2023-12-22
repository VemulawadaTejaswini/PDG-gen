import java.util.*;

class Main{
	public static void main(String[] args){
	  Scanner scn = new Scanner(System.in);
      int k = Integer.parseInt(scn.nextLine());
      String s = scn.nextLine();
      if(s.length() < k+1){
        System.out.println(s);
        return;
      }else{
        String ans = s.substring(0,k) + "...";
        System.out.println(ans);
      }
	}
}
