import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    int c = Integer.parseInt(a);
    int d = Integer.parseInt(b);
    String x = "";
    if(c >= d){
      for(int i = 0; i < c; i++){
        x += b;
      }
      System.out.println(x);
    }else{
        for(int i = 0; i<d; i++){
          x += a;
        }
      System.out.println(x);
      }
      
    }
  }
