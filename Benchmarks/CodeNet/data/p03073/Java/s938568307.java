import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
          if((i%2==0 && s.charAt(i)=='0')||(i%2==1 && s.charAt(i)=='1')){count++;}}
        ans = Math.min(count,s.length()-count);
		System.out.println(ans);
  }
}
