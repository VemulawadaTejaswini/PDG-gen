import java.util.*;
class aoj{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      while(sc.hasNext()){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a+b;
        String s = "" + i;
        System.out.print(s.length());
      }
    }finally{}
  }
}