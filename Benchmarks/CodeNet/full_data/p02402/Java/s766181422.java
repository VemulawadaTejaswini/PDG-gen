import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n-1];
    for(int i=0; i < n; i++){
      arr[i] = scan.nextInt();
    }
    int min = arr[0]; int max = arr[0]; int sum=0;
    for(int j=0; j < n; j++){
      if(arr[j] > max){max = arr[j];}
      if(arr[j] < min){min = arr[j];}
       sum = sum + arr[j];
    }
    System.out.println(min +" "+ max +" "+ sum);
  }
}