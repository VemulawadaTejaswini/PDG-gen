import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] height = new int[n];
    for(int i = 0 ; i < n ; i++){
      height[i] = Integer.parseInt(sc.next());
    }

    boolean pos = true;
    for(int i = 0 ; i < n - 1; i++){
     if(height[n - i - 2] - height[n - i - 1] <= 0){
       continue;
     }else if(height[n - i - 2] - height[n - i - 1] == 1){
       height[n - i - 2]--;
     }else{
       pos = false;
       break;
     }
    }
    if(pos){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}


