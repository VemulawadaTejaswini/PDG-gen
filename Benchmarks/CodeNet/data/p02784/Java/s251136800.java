import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    int[] arr = new int[N];
    int sum =0;
    for (int i = 0; i < N; i++) {
        arr[i] = Integer.parseInt(sc.next());
        sum += arr[i];
    }
    if(sum>= H){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}  
}

