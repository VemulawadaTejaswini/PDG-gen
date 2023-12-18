import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a=scanner.nextLong();
    long b=scanner.nextLong();
    int c=scanner.nextInt();
    int d=scanner.nextInt();
    //int a[]=new int[n];

    //System.out.println(a);
    int cnt=0;
    for(long i=a;i<=b;i++){
      if(i%c!=0&&i%d!=0){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
