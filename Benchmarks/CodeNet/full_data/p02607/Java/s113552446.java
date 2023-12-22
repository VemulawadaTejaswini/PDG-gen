import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < a.length; i++){
      a[i] = sc.nextInt();
    }

    //output
    int count = 0;
    for(int i = 0; i < a.length; i++){
      if( (i+1)%2 == 1 ){ //if the location is odd
        //System.out.println("test");
        if( a[i]%2 == 1 ){ //if num is odd
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
