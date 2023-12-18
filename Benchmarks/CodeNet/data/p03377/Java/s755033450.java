import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(), B = sc.nextInt(), X = sc.nextInt();
    //There has to be at least A cats
    //There can be at most A+B cats
    //If X is between A and A+B, then it is possible
    if(X >= A && X <= A+B){
      System.out.println("YES"); 
    }
    else{
      System.out.println("NO"); 
    }
  }
}

/*

pre[i] = arr[1] + arr[2] + arr[3] + arr[4] + ... + arr[i]
The question for some l and r
arr[l] + arr[l+1] + arr[l+2] + ... + arr[r]
= 
pre[r] - pre[l-1]

pre[r]   = arr[1] + arr[2] + ... + arr[l-1] + arr[l] + arr[l+1] + ... + arr[r]
-
pre[l-1] = arr[1] + arr[2] + ... + arr[l-1]

*/
