import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar= new int[n];
    boolean F = false;
    for(int i=0;i<n;i++){
      ar[i] = sc.nextInt();
      if(ar[i]%2 == 1){
        F = true;
      }
    }
    if(F == true){
      System.out.println(0);
    }else{
      int max = ar[0];
      for(int i=0;i<ar.length;i++){
        if(max<ar[i]){
          max = ar[i];
        }
      }
      int times = 0;
      while(max%2 == 0){
        max /= 2;
        times++;
      }
      System.out.println(times);
    }
  }
}