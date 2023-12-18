import java.util.*;
public class Main {
	public static void main(String[] args){
      String s = sc.next();
      int ans = 0;
      int zero = 0;
      int one = 0;
      for(int i=0;i<s.length();i++){if(s.charAt(i)=='0'){zero++;}
                                   else{one++;}
                                   }
      ans=Math.min(zero,one)*2;
	  System.out.println(ans);
  }
}
