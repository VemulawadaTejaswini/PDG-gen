import java.util.Scanner;
 
class Main{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] ar= new int[n];
  boolean F = false;  
  for(int i=0:i<n:i++){
    ar[i] = sc.nextInt();
    if(a[i]%2 == 1){
      F = true;
    }  
  }
  if(F ==true){
    System.out.println(0);
  }else{
    int max = Math.max(ar);
    int times = 0;
    for(max%2 == 0){
      int max /= 2;
      times++;
    }
    System.out.println(times);
  }  
}  