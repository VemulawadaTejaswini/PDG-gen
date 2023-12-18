import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    for (int i=1;i<=n;i++){
      for (int j=1;j<=n;j++){
        for (int k=1;k<=n;k++){
          sum += find(i,j,k);
        }
      }
    }
    System.out.println(sum);
  }

  public static int find(int a,int b,int c){
    int min = a;
    if (a>b){
      min = b;
    }
    if (min>c){
      min = c;
    }

    int l = min;
    while (l>1){
      if ((a%l == 0) && (b%l == 0) && (c%l == 0)){
        return l;
      }
      l -= 1;
    }
    return l;
  }

}
