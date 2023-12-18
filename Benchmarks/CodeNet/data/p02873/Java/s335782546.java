import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int ans=0;
    int tmp=0;
    int now=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='<'){
        now++;
        tmp=0;
        ans+=now;
      }else if(now!=0){
        tmp++;
        now--;
        ans+=now;
      }else{
        tmp++;
        ans+=tmp;
      }
    }
    System.out.println(ans);
    
    
  }
}
