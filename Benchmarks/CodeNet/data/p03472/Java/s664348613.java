import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long h = scan.nextLong();

    int[] a = new int[n];
    int[] b = new int[n];

    for (int i=0;i<n;i++){
      a[i] = scan.nextInt();
      b[i] = scan.nextInt();
    }

    Arrays.sort(a);
    Arrays.sort(b);

    int maxa = a[n-1];
    ArrayList<Integer> c = new ArrayList<Integer>();
    for (int j=n-1;j>=0;j--){
      if(b[j] <= maxa){
        break;
      }
      c.add(b[j]);
    }
    int count = 0;
    for (int k=0;k<c.size();k++){
      h -= c.get(k);
      count += 1;
      if (h <= 0){
        System.out.println(count);
        return;
      }
    }

    if (h % maxa == 0){
      count += (int) h/maxa;
    }
    else{
      count += 1;
      count += (int) h/maxa;
    }
    System.out.println(count);
  }

}
