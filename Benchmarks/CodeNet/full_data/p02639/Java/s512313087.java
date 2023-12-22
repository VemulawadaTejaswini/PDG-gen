import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int [] a = new int[5];
    for (int i=0;i<5;i++){
      a[i] = scan.nextInt();
    }

    for (int j=0;j<5;j++){
      if (a[j] == 0){
        System.out.println(j+1);
        return;
      }
    }
  }
}
