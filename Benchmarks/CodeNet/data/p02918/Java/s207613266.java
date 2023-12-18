import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    String s=sc.next();
    boolean fL=s.charAt(0)=='L';
    int ya=1;
    for(int i=0;i<n-1;i++){
      if(s.charAt(i)!=s.charAt(i+1)){
        ya++;
      }
    }
//    System.err.println(ya);
    while(ya>=2&&k>0){
      if(ya>=3){
        ya-=2;
      }else{
        ya--;
      }
      k--;
    }
    System.out.println(n-ya);
  }
}