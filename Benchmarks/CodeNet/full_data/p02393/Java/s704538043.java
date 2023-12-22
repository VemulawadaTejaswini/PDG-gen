import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] arr = new int[2];
    for(int i=0; i < 3; i++){
      arr[i] = scan.nextInt();
    }
    int X;
    if(arr[0] > arr[1]) {
      X = arr[0]; arr[0] = arr[1]; arr[1] = X;
    }
    if(arr[1] > arr[2]) {
      X = arr[1]; arr[1] = arr[2]; arr[2] = X;
    }
    if(arr[0] > arr[1]) {
      X = arr[0]; arr[0] = arr[1]; arr[1] = X;
    }
      for(int k=0; k<3; k++){
      System.out.println(arr[k] + " ");}
    }
  }
}