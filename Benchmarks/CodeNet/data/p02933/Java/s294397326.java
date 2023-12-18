import java.util.*;
class Red_or_Not{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    scan.nextLine();
    String s=scan.nextLine();
    if(a>=3200){
      System.out.println(s);
    }else{
      System.out.println("red");
    }
  }
}