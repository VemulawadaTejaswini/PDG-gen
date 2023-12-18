import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] a = new int[9];
    boolean[] b = new boolean[9];
    for (int i=0; i<9; i++){
      a[i] = scan.nextInt();
      b[i] = false;
    }

    int n = scan.nextInt();
    for (int j=0; j<n; j++){
      int t = scan.nextInt();
      for (int k=0;k<9;k++){
        if (a[k] == t){
          b[k] = true;
          continue;
        }
      }
    }

    for (int i=0; i<3; i+=1){
      if ((b[i] == true)&&(b[i+3] == true)&&(b[i+6] == true)){
        System.out.println("Yes");
        return;
      }
    }

    for (int i=0; i<7; i+=3){
      if ((b[i] == true)&&(b[i+1] == true)&&(b[i+2] == true)){
        System.out.println("Yes");
        return;
      }
    }

    if ((b[0] == true)&&(b[4] == true)&&(b[8] == true)){
      System.out.println("Yes");
      return;
    }

    if ((b[2] == true)&&(b[4] == true)&&(b[6] == true)){
      System.out.println("Yes");
      return;
    }

    System.out.println("No");
  }
}
