import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    int[] arr = new int[1];
    
    for(int i = 0; i < 100; i++) {
      if(i/a == i/b) {
		arr[0] = i;
        break;
      }
    }
    
    if(arr[0] == 0) {
      System.out.println("-1"); 
    } else {
      System.out.println(arr[0]); 
    }
  }
}