import java.util.Scanner;
class Main{
  public static void main(String[] args){
    int n = sc.nextInt();
    int[] seq = new int[n];
    total = 0;
   for(int i == 0; i < n; i++){
   seq[i] = sc.nextInt();
     if(i == 0){
     total += seq[i];
     }else if(i == n-1){
     total += seq[i];
     }else{
     total += Math.min(seq[i],seq[i-1]);
     }
     System.out.println(total);
   }  
  }

}