import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] arr = new String[N];
    String ans = "";
    boolean flag = true;
    for(int i=0;i<N;i++) {
      arr[i] = sc.next();
      if(i>0 && arr[i].charAt(0) == arr[i-1].charAt(arr[i-1].length()-1)) {
        ans = "Yes";
      }
    }
    Arrays.sort(arr);
    for(int j=1;j<N;j++) {
      if(arr[j].equals(arr[j-1])) {
        flag = false;
        break;
      }
    }
    if(ans == "Yes" && flag == true) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }


    }


  }
