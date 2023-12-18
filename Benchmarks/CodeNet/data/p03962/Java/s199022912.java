import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[3];
    int count = 1;
    int i;
    for(i = 0;i < 3;i++){
      a[i] = sc.nextInt();
    }
    for(i = 0;i < 2;i++){
      if(a[i] != a[i+1]){
        count++;
      }
    }
    System.out.println(count);
  }
}
