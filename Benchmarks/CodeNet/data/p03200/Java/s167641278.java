import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      String s[]=line.split("",0);
      int ans=0,l=0;
      for(int i=0;i<s.length;i++){
      	if(s[i].equals("W")){
        	l++;
          ans+=i+1;
        }
      }
      l=l*(l+1)/2;
        System.out.println(ans-l);
    }
}