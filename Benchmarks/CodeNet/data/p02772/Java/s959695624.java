import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ints = new int[n];
    boolean bl = true;
    for(int i = 0; i < n; i++){
      ints[i] = sc.nextInt();
      bl &= ((int[i] % 2 == 1) || (int[i] % 3 == 0 || int[i] % 5 == 0);
    }
    if(bl){
      System.out.println("APPROVED");
    }else{
      System.out.println("DENIED");
    }
    
  }
}