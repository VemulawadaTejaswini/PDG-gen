import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int [n];
          for (int i = 0; i < array.length; i++) {
                  array[i]=scan.nextInt();
            }
            search(array);
        }
        static void search( int arr[] ){
          int max = arr[0];
          int min = arr[0];
          long sum=0;
          for (int i = 1; i < arr.length; i++) {
              if (arr[i] > max) {
                  max = arr[i];
              }
          }  
          for (int i = 1; i < arr.length; i++) {
              if (arr[i] < min) {
                  min = arr[i];
              }
          }
            for (int i = 0; i < arr.length; i++) {
              sum = sum + arr[i];
          }
          System.out.printf("%d %d %d\n",min,max,sum);
    }
}
