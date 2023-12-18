import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    ArrayList<String> array = new ArrayList<String>();
    for(int a=0;a<H;a++){
      array.add(sc.next());
    }
    for(int b=0;b<W+1;b++){
      System.out.print("#");
    }
    System.out.println("#");
    for(int c=0;c<H;c++){
      System.out.println("#"+array.get(c)+"#");
    }
    for(int d=0;d<W+2;d++){
      System.out.print("#");
    }
  }
}