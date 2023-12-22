import java.util.*;
 
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int disall=scan.nextInt();
    int x,y;
    int ans=0;
    for(int a=0; a<num; a++){
      x=scan.nextInt();
      y=scan.nextInt();
      if(Math.sqrt((long)x*(long)x+(long)y*(long)y)<=disall){
        ans++;
      }
    }
    System.out.println(ans);
  }
}