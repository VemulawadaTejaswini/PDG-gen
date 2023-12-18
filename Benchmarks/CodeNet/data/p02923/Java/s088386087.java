import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n];
    int count = 0;

    int max = 0;

    for(int i = 0;i < n;i++){
      data[i] = sc.nextInt();
    }



    for(int i = 0;i < n-1;i++){
      if(data[i] >= data[i+1]){
        count++;
      }else{
        count = 0;
      }

      if(max < count){
        max = count;
      }
    }

    System.out.println(max);

  }

}
