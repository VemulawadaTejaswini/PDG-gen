import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int wl=0;
    int wr=sc.nextInt();
    int hd=0;
    int hu=sc.nextInt();
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      int x=sc.nextInt();
      int y=sc.nextInt();
      int a=sc.nextInt();
      if(a==1){
        wl=Math.max(x,wl);
      }else if(a==2){
        wr=Math.min(x,wr);
      }else if(a==3){
        hd=Math.max(y,hd);
      }else{
        hu=Math.min(y,hu);
      }
    }
    System.out.println(Math.max(wr-wl,0)*Math.max(hu-hd,0));
  }
}