import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[2];
    for(int i=0; i < 3; i++){
      arr[i] = scan.nextInt();
    }
    int X;
    for(int j=1; j < 3; j++){
      if(arr[j-1] > arr[j]) {
        X = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = X;
      }
      if(arr[j-1] > arr[j]) {
        X = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = X;}
      System.out.println(arr[j-1] + " ");
    }
  }
}