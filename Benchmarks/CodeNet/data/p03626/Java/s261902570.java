import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    //縦＝X,横＝Yとして管理
    //初手はX=3通り、Y=6通り
    //二手目以降は、直左がXのX=2通り、直左がYのX=1通り、直左がXのY=2通り,直左がYのY=3通り
    ArrayList<String> mg = new ArrayList<String>();
    boolean iscontinue=false;
    for(int i=0;i<N-1;i++){
      if(S.substring(i,i+1).equals(S.substring(i+1,i+2))&&!iscontinue){
      mg.add("Y");
      iscontinue=true;
      }else if(iscontinue){
      iscontinue=!iscontinue;  
      continue;
      }else{
      mg.add("X");
      iscontinue=false;
      }
    }
    if(!iscontinue){
      mg.add("X");
    }
    long answer =1;
    long mod =1000000007;
    String tmp="";
    for(String s :mg){
      if(answer==1){
        if(s.equals("X")){
          answer=3;
          tmp="X";
        }else{
          answer=6;
          tmp="Y";
        }
      }else{
        if(s.equals("X")&&tmp.equals("X")){
          answer=(answer*2)%mod;
          tmp="X";
        }else if(s.equals("X")&&tmp.equals("Y")){
          answer=answer;
          tmp="X";
        }else if(s.equals("Y")&&tmp.equals("X")){
          answer=(answer*2)%mod;
          tmp="Y";
        }else{
          answer=(answer*3)%mod;
          tmp="Y";
        }
      }
    }
    System.out.println(answer);
  }
}