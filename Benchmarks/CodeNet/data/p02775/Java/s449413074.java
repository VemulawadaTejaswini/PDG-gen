import java.util.*;

class Main{
  public static int min(int a,int b){
    return (a<b)?a:b;
  }
  
  public static int max(int a,int b){
    return (a>b)?a:b;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int[] num=new int[str.length()];
    int[] pay=new int[str.length()+1];
    int[] ret=new int[str.length()+1];
    int ans=0;
    
    for(int i=0;i<str.length();i++){
      num[str.length()-i-1]=Character.getNumericValue(str.charAt(i));
    }
    
    for(int i=0;i<str.length();i++){
      if(num[i]>=0&&num[i]<=5){
        pay[i]+=num[i];
        ret[i]+=0;
      }else{
        ret[i]+=10-num[i];
        pay[i+1]+=1;
      }
    }

    for(int i=0;i<str.length()+1;i++){
      ans+=max(pay[i],ret[i])-min(pay[i],ret[i]);
    }
    
    System.out.print(ans);
  }
}
