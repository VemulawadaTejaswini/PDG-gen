import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] stairs = new int[n];
    boolean bl = true;
    for(int i = 0; i< n; i++){
      stairs[i] = sc.nextInt();
    }
    if(n != 1){
      for(int i = 0; i < n - 1; i++){
        if(i == 0){
          if(stairs[0] - stairs[1] >= 2){
            bl = false;
            break;
          }else if(stairs[i] - stairs[i + 1] >= 2){
            bl = false;
            break;
          }else if(stairs[i] - stairs[i + 1] == 1 && stairs[i] > stairs[i - 1]){
            stairs[i]--;
          }else if(stairs[i] - stairs[i + 1] == 1 && stairs[i] == stairs[i - 1]){
            bl = false;
            break;
          }
        }
      }
    }
    if(bl)System.out.println("Yes");
    else{
      System.out.println("No");
    }
  }
}
