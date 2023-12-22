import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String a=scan.next();
    String b=scan.next();
    String[] a1=a.split("");
    String[] b1=b.split("");
    boolean flag=true;
    for(int x=0; x<a1.length; x++){
      if(!(a1[x].equals(b1[x]))){
        flag=false;
      }
    }
    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}