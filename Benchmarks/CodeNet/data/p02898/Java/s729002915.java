import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int k=sc.nextInt();
    int count=0;
    for(int i=0;i<n;i++) {
      int temp = sc.nextInt();
      if(temp >=k) {
        count++;
      }
    }
    System.out.println(count);
}
}
