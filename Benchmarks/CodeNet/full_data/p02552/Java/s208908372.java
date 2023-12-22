import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    
    int x = a * c;
    int y = a * d;
    int z = b * c;
    int w = b * d;
    int[] n = new int[4];
    
    n[0] = x;
    n[1] = y;
    n[2] = z;
    n[3] = w;
    int max = x;

    for(int i = 0; i < 4; i++){
      if(n[i] > max){
        max = n[i];
      }
    }
    System.out.print(max);
  }
}