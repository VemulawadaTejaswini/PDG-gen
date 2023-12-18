import java.util.*;
public class Main{

  static void findAns(long n,long ans,int count){

    if(n>1){
      ans+=Math.pow(2,count);
      ++count;
      findAns(n/2,ans,count);
    }
    else{
      ans+=Math.pow(2,count);
      System.out.println(ans);
    }
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long ans=0;
    findAns(n,ans,0);
  }
}
