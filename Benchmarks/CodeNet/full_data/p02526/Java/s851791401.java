import java.util.Scanner;

public class Main{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 counter=0;
  int n=sc.nextInt();
  int[] S =new int[100000];
  for(int i=0;i<n;i++){
   S[i]=sc.nextInt();
  }
  int q=sc.nextInt();
  int T;
  for(int j=0;j<q;j++){
   T=sc.nextInt();
   for(int k=0;k<n;k++){
    if(T==S[k]){
     counter++;
     break;
     }
   }
  }
  System.out.println(counter);
 }
}