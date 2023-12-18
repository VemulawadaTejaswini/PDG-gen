import java.util.*;
class Main {
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int sum = 0;
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        sum += arr[i];
    }
    double thres = (sum/(4.0*k));
    //System.out.println(thres);
    int c = 0;
    for(int i = 0; i < n; i++) {
        if(arr[i] >= thres) {
            c++;
        }
    }
    if(c >= k) {
        System.out.println("Yes");
    }
    else {
        System.out.println("No");
    }
  }
}