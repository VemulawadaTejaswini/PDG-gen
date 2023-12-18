import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 2^n-1;
    for(int i = 1; i <= a; i++){
      int num;
            num = num * (n - i + 1) / i;
       return num};
    for(int i = 1; i <= b; i++){
      int nume ;
            nume = nume * (n - i + 1) / i;
       return nume; };
    int d = c - num*(2^a) - nume*(2^b);
    int e = d/(10^9+7);
    System.out.println( e );
  }
}
    