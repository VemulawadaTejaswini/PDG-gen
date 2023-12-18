import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int taste = 0;
    int min = 0;
    int souwa = n * l + (n * (n + 1) ) - n;
        for(int i = 1; i < n; i++){
            if(Math.abs(l + i - 1) < Math.abs(l + i)){
              min = l + i - 1;
            }
        }
    taste = souwa - min;
    System.out.println(taste);
  }
}