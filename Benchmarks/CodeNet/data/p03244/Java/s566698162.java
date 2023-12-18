import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int half = (int) n/2;
    int [] a = new int[half+1];
    int [] b = new int[half+1];

    int current1 = 1;
    int sum1 = 0;
    int current2 = 1;
    int sum2 = 0;
    int c1 = 1;
    int c2 = 1;
    int max1 = 0;
    int p1 = 0;
    int max2 = 0;
    int p2 = 0;

    for (int i=0;i<half;i++){
      a[i] = scan.nextInt();
      b[i] = scan.nextInt();
    }

    a[half] = (int) Math.pow(10,6);
    b[half] = (int) Math.pow(10,6);

    Arrays.sort(a);
    Arrays.sort(b);

    int start1 = a[0];
    int count1 = 1;
    for (int j=1;j<half;j++){
      if (a[j] == a[j-1]){
        count1 += 1;
      }
      else{
        if (count1 >= sum1){
          p1 = sum1;
          sum1 = count1;
          max1 = a[j-1];
        }
        c1 += 1;
        count1 = 1;
      }
    }

    int start2 = b[0];
    int count2 = 1;
    for (int j=1;j<half;j++){
      if (b[j] == b[j-1]){
        count2 += 1;
      }
      else{
        if (count2 >= sum2){
          p2 = sum2;
          sum2 = count2;
          max2 = b[j-1];
        }
        c2 += 1;
        count2 = 1;
      }
    }

    if (c1 == 1){
      sum1 = half;
      p1 = 0;
      max1 = a[0];
    }

    if (c2 == 1){
      sum2 = half;
      p2 = 0;
      max2= b[0];
    }

    if (max1 == max2){
      if (sum1 + p2 > sum2 + p1){
        sum2 = p2;
      }
      else{
        sum1 = p1;
      }
    }

    int g = n-sum1-sum2;
    System.out.println(g);

  }
}
