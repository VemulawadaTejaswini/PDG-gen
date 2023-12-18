import java.util.Scanner;
public static Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt() * 100;
    int g = sc.nextInt() * 10;
    int b = sc.nextInt();
    int t = r + g + b;
    if(t%4 == 0){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }   
  }
}
