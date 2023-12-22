import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = sc.next();
      int min = 1000;
      int count;
      for(int i=0;i<S.length()-T.length();i++){
        count = 0;
        for(int j=0;j<T.length();j++){
            if(S.charAt(j+i)!=T.charAt(j)){
              count++;
            }
        }
        min = Math.min(min,count);
      }
      System.out.println(min);
    }
}
