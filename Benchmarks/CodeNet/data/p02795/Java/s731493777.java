import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int R=sc.nextInt();
  int C=sc.nextInt();
  int N=sc.nextInt();
  int sum=0,count=0;
  if(R>C){
  while(sum<N){
  sum+=R;
    count++;
  }
  }
  else{
  while(sum<N){
  sum+=C;
    count++;
  }
  }
  System.out.print(count);
}
}