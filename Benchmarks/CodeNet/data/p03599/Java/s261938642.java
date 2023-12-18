import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();
    sc.close();

    int[] arr = new int[]{0,0,0,0};
    int[] best = arr.clone();
    check(a,b,c,d,e,f,arr,best);

    int all    = best[0]*a*100+best[1]*b*100+best[2]*c+best[3]*d;
    int sugar  = best[2]*c+best[3]*d;
    System.out.println(String.format("%d %d", all,sugar));
  }

  private static Double check(int a, int b, int c, int d, int e, int f, int[] arr, int[] best) {
    int vol = arr[0]*a*100+arr[1]*b*100+arr[2]*c+arr[3]*d;
    if (vol>f)
      return null;

    int sugar = arr[2]*c+arr[3]*d;
    if (sugar>0 && sugar==(arr[0]*a+arr[1]*b)*e)
      return 1D;

    Double checker;
    Double max=0D;
    if (sugar > (arr[0]*a+arr[1]*b)*e) {
      arr[0]++;
      checker = check(a,b,c,d,e,f,arr,best);
      if (checker!=null) {
        if (checker == 1) {
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
          return 1D;
        } else if (checker>max) {
          max=checker;
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
        }
      }
      arr[0]--;
      arr[1]++;
      checker = check(a,b,c,d,e,f,arr,best);
      if (checker!=null) {
        if (checker == 1) {
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
          return 1D;
        } else if (checker>max) {
          max=checker;
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
        }
      }
      arr[1]--;
    } else {
      arr[2]+=100;
      checker = check(a,b,c,d,e,f,arr,best);
      if (checker!=null) {
        if (checker == 1) {
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
          return 1D;
        } else if (checker>max) {
          max=checker;
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
        }
      }
      arr[2]-=100;
      arr[2]+=50;
      checker = check(a,b,c,d,e,f,arr,best);
      if (checker!=null) {
        if (checker == 1) {
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
          return 1D;
        } else if (checker>max) {
          max=checker;
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
        }
      }
      arr[2]-=50;
      arr[2]++;
      checker = check(a,b,c,d,e,f,arr,best);
      if (checker!=null) {
        if (checker == 1) {
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
          return 1D;
        } else if (checker>max) {
          max=checker;
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
        }
      }
      arr[2]--;

      arr[3]+=100;
      checker = check(a,b,c,d,e,f,arr,best);
      if (checker!=null) {
        if (checker == 1) {
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
          return 1D;
        } else if (checker>max) {
          max=checker;
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
        }
      }
      arr[3]-=100;
      arr[3]+=50;
      checker = check(a,b,c,d,e,f,arr,best);
      if (checker!=null) {
        if (checker == 1) {
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
          return 1D;
        } else if (checker>max) {
          max=checker;
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
        }
      }
      arr[3]-=50;
      arr[3]++;
      checker = check(a,b,c,d,e,f,arr,best);
      if (checker!=null) {
        if (checker == 1) {
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
          return 1D;
        } else if (checker>max) {
          max=checker;
          best[0] = arr[0];
          best[1] = arr[1];
          best[2] = arr[2];
          best[3] = arr[3];
        }
      }
      arr[3]--;
    }

    double water = arr[0]*a*100+arr[1]*b*100;
    sugar = arr[2]*c+arr[3]*d;

    if (water==0)
      return null;
    if (sugar > (arr[0]*a+arr[1]*b)*e)
      return null;
    double noudo = sugar/(water+sugar);
    return noudo;
  }
}