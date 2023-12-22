import java.util.Scanner;

public class Main{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int n,m;

n = sc.nextInt();
  m= sc.nextInt();
int t=0;
int sum = 0;
int sum_l = 0;
int bar[] = new int[100];

  for(int i = 0;i<n;i++){
    sum = 0;

    for(int l =0;l<m;l++){
      t = sc.nextInt();
      System.out.print(t+" " );
bar[l] +=t;
      sum+=t;
    }

    sum_l+=sum;
System.out.println(sum);
  }


  for(int i = 0; i< m; i++){
    System.out.print(bar[i]);
    System.out.print(" ");
  }
  System.out.println(sum_l);

  }//main

}//class

