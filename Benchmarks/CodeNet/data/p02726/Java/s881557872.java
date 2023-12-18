import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int min;
    sc.close();
    int[] d = new int[n];
    for(int i = 1; i <= n; i++){
      for(int j = i + 1; j <= n; j++){
        if(j <= x){
          d[j - i]++;
        }else if(i >= y){
          d[j - i]++;
        }else if(i <= x && y <= j){
          d[(x - i) + 1 + (j - y)]++;
        }else if(i <= x && j <= y){
          min = Math.min(j - i, (x - i) + 1 + (y - j));
          d[min]++;
        }else if(i <= x && y <= j){
          min = Math.min(j - i, (j - y) + 1 + (i - x));
          d[min]++;
        }else{
          min = Math.min(j - i, (y - j) + 1 + (i - x));
          d[min]++;
        }
      }
    }
    for(int i = 1; i <= n - 1; i++){
      System.out.println(d[i]);
    }
  }
}