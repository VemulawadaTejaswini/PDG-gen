import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int half = (int) n/2;
    int [] a = new int[half+1];
    int [] b = new int[half+1];

    HashMap<Integer,Integer> gg1 = new HashMap<Integer, Integer>();
    HashMap<Integer,Integer> gg2 = new HashMap<Integer, Integer>();
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

    int [] kk1 = new int[half+1];
    int [] kk2 = new int[half+1];

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
      kk1[j] = count1;
      gg1.put(count1,a[j]);
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
      kk2[j] = count2;
      gg2.put(count2,b[j]);
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

    Arrays.sort(kk1);
    Arrays.sort(kk2);

    int g = n-kk1[half]-kk2[half];

    if (gg1.get(kk1[half]) == gg2.get(kk2[half])){
      g = Math.min(n-kk1[half-1]-kk2[half], n-kk1[half]-kk2[half-1]);
    }

    System.out.println(g);

  }
}
