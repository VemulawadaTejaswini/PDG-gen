import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[4][4];
    for (int i=1;i<=3;i++) {
      for (int j=1;j<=3;j++) {
        a[i][j]=sc.nextInt();
      }
    }
    int n=sc.nextInt();
    ArrayList<Integer>b=new ArrayList<Integer>();
    for (int i=0;i<n;i++) {
      b.add(sc.nextInt());
    }

    for (int i=1;i<=3;i++) {
      for (int j=1;j<=3;j++) {
       if (b.contains(a[i][j])) {
         a[i][j]=0;
       }
      }
    }

    if(a[1][1]==0&&a[1][2]==0&&a[1][3]==0||a[2][1]==0&&a[2][2]==0&&a[2][3]==0||a[3][1]==0&&a[3][2]==0&&a[3][3]==0
    ||a[1][1]==0&&a[2][2]==0&&a[3][3]==0||a[1][3]==0&&a[2][2]==0&&a[3][1]==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }

  }
}
