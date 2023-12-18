import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m,n = 0;
    int[] data = new int[1000];
    int temp;

    while (sc.hasNext()) {
        data[n] = sc.nextInt();
        n++;
    }

    for(int i=0 ; i<n-1 ; i++){
      for(int j=i+1 ; j<n ; j++){
        if(data[i] < data[j]){
          temp = data[i];
          data[i] = data[j];
          data[j] = temp;
        }
      }
    }
    System.out.println();

    int x = data[0] - data[n-1];
    System.out.println(x);
  }
}
