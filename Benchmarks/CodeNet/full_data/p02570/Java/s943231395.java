import java.util.*;
public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc=new Scanner(System.in);
    int D=Integer.parseInt(sc.next());
    int T=Integer.parseInt(sc.next());
    int S=Integer.parseInt(sc.next());
    if(D/S<=T){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
