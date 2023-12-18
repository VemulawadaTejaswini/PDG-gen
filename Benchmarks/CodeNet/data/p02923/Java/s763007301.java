import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int  n = sc.nextInt();
    int[] h = new int[n+1];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }
    h[n]=Integer.MAX_VALUE;
    int max=0;
    int ple=h[0];
    int pdx=0;
    for(int i=1;i<=n;i++){
      if(ple>=h[i]){
        ple=h[i];
      }else{
        max=Math.max(i-pdx-1,max);
        ple=h[i];
        pdx=i;
      }
    }
    System.out.println(max);
  }
}
