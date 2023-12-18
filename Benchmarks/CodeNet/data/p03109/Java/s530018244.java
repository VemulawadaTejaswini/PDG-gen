import java.util.Scanner;

public class Main{
  public static void heisei(){
    System.out.println("Heisei");
  }

  public static void tbd(){
    System.out.println("TBD");
  }


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String ss = s.replace("/","");

    if(ss.compareTo("20190430")<=0){
      heisei();
    }else{
      tbd();
    }

  }
}