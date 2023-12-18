import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    long ans=0;
    boolean du=false;
    StringBuilder sb=new StringBuilder();
    for(int i=s.length()-1;i>=0;i--){
      int d=s.charAt(i)-'0';
      if(du){
        d++;
      }
      int su=d;
      int iv=10-d;
      if(su<iv+1){
        ans+=su;
        du=false;
        sb.insert(0,String.valueOf(su));
      }else{
        ans+=iv;
        du=true;
        sb.insert(0,"0");
      }
    }
    if(du){
      ans++;
      sb.insert(0,"1");
    }
    System.err.println(sb);
    System.err.println(s);
    StringBuilder turi=new StringBuilder();
    boolean sage=false;
    for(int i=s.length()-1;i>=0;i--){
      if(sage){
        if(sb.charAt(i)-1-s.charAt(i)>=0){
          turi.insert(0,String.valueOf(sb.charAt(i)-1-s.charAt(i)));
          sage=false;
        }else{
          turi.insert(0,String.valueOf(sb.charAt(i)-1+10-s.charAt(i)));
          sage=true;
        }
      }else{
        if(sb.charAt(i)-s.charAt(i)>=0){
          turi.insert(0,String.valueOf(sb.charAt(i)-s.charAt(i)));
          sage=false;
        }else{
          turi.insert(0,String.valueOf(sb.charAt(i)+10-s.charAt(i)));
          sage=true;
        }
      }
    }
    System.err.println(turi);
    System.err.println(nanmai(sb));
    System.err.println(nanmai(turi));
    System.out.println(ans);
  }
  static int nanmai(CharSequence cs){
    int res=0;
    for(int i=0;i<cs.length();i++){
      res+=cs.charAt(i)-'0';
    }
    return res;
  }
}