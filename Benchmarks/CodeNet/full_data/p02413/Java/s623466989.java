import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int[][] a=new int[r+1][c+1];
    int sum=0;
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=sc.nextInt();
        a[i][c]+=a[i][j];
        a[r][j]+=a[i][j];
        sum+=a[i][j];
      }
    }
    a[r][c]=sum;
    for(int i=0;i<r+1;i++){
      for(int j=0;j<c;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println(a[i][c]);
    }
  }
}


