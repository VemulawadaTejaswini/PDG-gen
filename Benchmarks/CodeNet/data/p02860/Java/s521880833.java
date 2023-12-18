import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String s = sc.next();
    String f ,b;
    if(N%2!=0){
      System.out.print("No");
    }else{
      f = s.substring(0,N/2);
      b = s.substring(N/2,N);
      if(f.equals(b)){
        System.out.print("Yes");
      }else{
        System.out.print("No");
      }
    }
    System.out.flush();
    
  }
}