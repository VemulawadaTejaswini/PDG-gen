import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
    while(true){
      String a = sc.next();
      if(a.equals("-")){break;}
      int n = sc.nextInt();
      for(int j=0;j<n;j++){
        int h = sc.nextInt();
        a = a.substring(h) + a.substring(0,h);
      }
      System.out.println(a);
}
    }
  }
}

