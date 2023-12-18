import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int max=0;
    int min=101;
    for(int i=0;i<n;i++){
      int s=sc.nextInt();
      max+=s;
      if(s%10!=0){
        min=Math.min(s,min);
      }
    }
    if((max%10)!=0){
      System.out.println(max);
    }else if(min==101){
      System.out.println(0);
    }else{
      System.out.println(max-min);
    }
  }
}