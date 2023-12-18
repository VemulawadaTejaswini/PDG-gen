import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    boolean flag=true;
    int aa=a, bb=b;
    while(flag){
      if(aa<bb){
        aa+=a;
      }else if(bb<aa){
        bb+=b;
      }else if(aa==bb){
        flag=false;
      }
    }
    System.out.println(aa);
  }
}