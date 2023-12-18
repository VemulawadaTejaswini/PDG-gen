import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] h=new int[n];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }
    h[0]=h[0]-1;
    for(int i=1;i<n;i++){
      if(h[i-1]<h[i]){
        h[i]=h[i]-1;
      }else if(h[i-1]>h[i]){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}