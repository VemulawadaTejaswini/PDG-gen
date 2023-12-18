import java.util.Scanner;
public class Main{
  	public static void main (String [] args){
      	Scanner scanner = new Scanner (System.in);
      	int N = scanner.nextInt();
      	int [] arr = new int [N];
      	for (int i = 0; i < N; i++){
          	arr[i] = scanner.nextInt();
        }
      	int counter = 0;
      	for (int i = 1; i < N; i++){
          	if (arr[i-1] <= arr[i]) counter++;
        }
      	System.out.println(counter);
    }
}