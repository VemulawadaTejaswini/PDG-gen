import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int nn = sc.nextInt();
      	String s = sc.next();
		int ans = 0;
      	for(int i=0;i<s.length();i++){
          String tmp = "";
          for(int j=0;j<s.length();j++){
            if( i!=j ){
              tmp += ""+s.charAt(j);
            }else{
              if( s.charAt(j) == '0' ){
                tmp += "1";
              }else{
                tmp += "0";
              }
            }
          }
          //System.out.println(tmp);
          count2(tmp,0);
        }
	}
  public static int count(String s){
    int ans = 0;
    for(int i=0;i<s.length();i++){
      if( '1' == s.charAt(i) ){
        ans++;
      }
    }
    return ans;
  }
  public static void count2(String s,int ans){
    if(count(s)==0){
      System.out.println(ans);
    }else{
      int n = Integer.parseInt(s, 2);
      int k = n % count(s);
      String bin = Integer.toBinaryString(k);
      //System.out.println(n+":"+k+":"+bin);
      count2(bin,ans+1);
    }
  }
}