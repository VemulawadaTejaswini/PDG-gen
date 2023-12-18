import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] array = new int[n];

    int count = 0;
    boolean fail = false;
    for(int i = 0; i < n; i++){
      array[i] = sc.nextInt();

      for(int j = 0; j <= i; j++){
        if( array[j] < array[i] ){
          fail = true;
          break;
        }
      }

      if(fail){
        fail = false;
        continue;
      }else{
        count++;
      }

    }
    System.out.println(count);
  }
}
