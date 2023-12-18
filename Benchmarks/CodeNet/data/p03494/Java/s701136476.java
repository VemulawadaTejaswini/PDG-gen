import java.util.Scanner;

class Main{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] ar = new int[n];
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
    int m = Math.max(a);
    int times = 0;
    while(m%2 == 0){
      m /= 2;
      times++;
    }
    System.out.println(times);
  }
}