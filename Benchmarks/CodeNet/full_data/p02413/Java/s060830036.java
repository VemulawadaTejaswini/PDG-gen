import java.util.Scanner;

class Main{
  public static void main(String args[]){
    int i,j,r,c,wsum;
    int [][] table = new int[101][101];
    int [] hsum = new int[101];
    Scanner sc = new Scanner(System.in);
    r = sc.nextInt();
    c = sc.nextInt();
    for(i = 0;i < r;i++){
      for(j = 0;j < c;j++){
        table[i][j]  = sc.nextInt();
      }
    }
    for(i = 0;i < c + 1;i++){
      hsum[i] = 0;
    }
    for(i = 0;i < r;i++){
      wsum = 0;
      for(j = 0;j < c;j++){
        System.out.print(table[i][j] + " ");
        wsum += table[i][j];
        if(j == c - 1){
          System.out.println(wsum);
          hsum[c] += wsum;
        }
        hsum[j] += table[i][j];
      }
    }
    for(i = 0;i < c;i++){
      System.out.print(hsum[i] + " ");
    }
    System.out.println(hsum[i]);
  }
}