import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int n = sc.nextInt();
    int intArray[][] = new int[h][w];
    int count[] = new int[9];

    int a;
    int b;
    for(int i = 0;i<n;i++){
      a = sc.nextInt();
      b = sc.nextInt();
      intArray[a-1][b-1]=1;
    }
    for(int i = 0;i < h-2;i ++){
      for(int j = 0;j < w-2;j ++){
        int black = 0;
        for(int k = i;k<i+3;k++){
          for(int l = j;l<j+3;l++){
            if(intArray[k][l]==1){
              black += 1;
            }
          }
        }
        count[black] += 1;
      }
    }
    for (int i = 0;i<10;i++){
      System.out.println(count[i]);
    }



  }
}
