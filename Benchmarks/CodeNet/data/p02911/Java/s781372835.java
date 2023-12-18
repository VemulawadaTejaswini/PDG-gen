import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();


    int[] ps = new int[n];

    for(int i=0; i<n; i++){
      ps[i] = k;
    }
    for(int j=0; j<q; j++){
      int a = sc.nextInt();
      ps[a-1] = ps[a-1] +1;
    }

    for(int i=0; i<n; i++){
      if(q - ps[i]<0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }

  }
}