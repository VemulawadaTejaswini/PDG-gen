import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String [] a = new String [2];
    a[0] = "";
    a[1] = "";
    for (int i=0;i<2;i++){
      for (int j=0;j<n;j++){
        String t = scan.nextInt()+"";
        a[i] += t;
      }
    }

    String c = a[0];
    String d = a[1];
    int[] gg1 = new int[2];
    boolean[] check1 = new boolean[n];
    int[] gg2 = new int[2];
    boolean[] check2 = new boolean[n];
    int[] e = find(c,"",n,gg1,check1);
    int[] f = find(d,"",n,gg2,check2);
    if (e[1] >= f[1]){
      System.out.println(e[1]-f[1]);
    }
    else{
      System.out.println(f[1]-e[1]);
    }
  }

  public static int[] find(String a,String b,int n, int[] count,boolean[] check){

    if (b.length() == n){
      count[0] += 1;
      if (a.equals(b)){
        count[1] = count[0];
      }
      return count;
    }

    for (int i=0;i<n;i++){
      if (check[i] == false){
        String current = b;
        int l = i+1;
        b += l+"";
        check[i] = true;
        count = find(a,b,n,count,check);
        if (count[1] !=0 ){
          return count;
        }
        check[i] = false;
        b = current;
      }
    }
    return count;
  }
}
