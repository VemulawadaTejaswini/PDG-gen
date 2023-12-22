import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int x1 = Math.max(a,b);
    int y1 = Math.max(a,b);
    int x2 = Math.max(a,b);
    int y2 = Math.max(a,b);
    int ans=Integer.MIN_VALUE;;
    int[] arr = new int[4];
    arr[0]=a*c;
    arr[1]=a*d;
    arr[2]=b*c;
    arr[3]=b*d;
    for(int i=0;i<4;i++){
      if(arr[i]>ans){
        ans=arr[i];
      }
    }
    System.out.println(ans);
  }
}