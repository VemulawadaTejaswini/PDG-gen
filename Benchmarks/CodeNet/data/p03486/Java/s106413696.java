import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      String[] s1 = new String[s.length()];
      String[] t1 = new String[t.length()];
      for(int i = 0;i<s.length();i++){
      	s1[i] = s.substring(i,i+1);
      }
      for(int j = 0;j<t.length();j++){
      	t1[j] = t.substring(j,j+1);
      }
      Arrays.sort(s1);
      Arrays.sort(t1);
      if(s1[0].compareTo(t1[t.length()-1])>=0){
      	System.out.println("No");
      }else{
      	System.out.println("Yes");
      }
    }
}