import java.util.Scanner;

class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int min, max;
    long sum;
    int[] a = new int[num];

    min = max = sum = a[0] = sc.nextInt();

    for(int i=1 ; i < num ; i++){
      a[i] = sc.nextInt();
      if(a[i]<min) min = a[i];
      if(a[i]>max) max = a[i];
      sum += a[i];
    }
      System.out.println(min+" "+max+" "+sum);
  }
}