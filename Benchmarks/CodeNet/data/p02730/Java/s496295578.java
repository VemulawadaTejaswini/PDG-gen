import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] input = sc.next().toCharArray();
    int n = input.length;
    boolean bl = true;
    for(int i = 0; i < (n - 1) / 2; i++){
      bl &= (input[i] == input[n - 1 - i]);
    }
    for(int i = 0; i < (n - 1) / 4; i++){
      bl &= (input[i] == input[(n - 1) / 2 - 1 -i]);
      
    }
    if(bl){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
} 