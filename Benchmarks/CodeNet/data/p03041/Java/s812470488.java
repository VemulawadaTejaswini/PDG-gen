import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int k = sc.nextInt();
      String s = sc.next();
      String ss[];
      ss = new String[n];
      for(int i=0;i<n;i++){
        ss[i]=s.substring(i,i+1);
      }
      if("A".equals(ss[k-1])){
        ss[k-1]="a";
      }
      if("B".equals(ss[k-1])){
        ss[k-1]="b";
      }
      if("C".equals(ss[k-1])){
        ss[k-1]="c";
      }
      String ans="";
      for(int j=0;j<n;j++){
        ans+=ss[j];
      }
      // 出力
      System.out.println(ans);
	}
}