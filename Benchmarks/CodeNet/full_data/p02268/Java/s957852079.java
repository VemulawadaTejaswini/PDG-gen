import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] s = new int[n];
    for(int i = 0; i < n; i++){s[i] = sc.nextInt();}
    int q = sc.nextInt();
    int[] t = new int[q];
    int cnt = 0;
    for(int i = 0; i < q; i++){
      t[i] = sc.nextInt();
      if(binary(s, t[i], n)){cnt++;}
    }
    System.out.println(cnt);
  }

  public static boolean binary(int[] s, int target, int n){
    int left = 0;
    int right = n;
    int mid = 0;

    while(left < right){
      mid = (left + right) / 2;
      if(target == s[mid]){return true;}
      if(target > s[mid]){left = mid + 1;}
      else if(target < s[mid]){right = mid;}
    }

    return false;
  }
}

