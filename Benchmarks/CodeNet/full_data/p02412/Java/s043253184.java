import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  Scanner scan=new Scanner(System.in);

  int n,sum;

  while(true){
  int count = 0;
  n = scan.nextInt();
  sum = scan.nextInt();

  if(n==0 && count==0)break;

    for(int i=1;i<n;i++){
      for(int j=1;j<n;j++){
      int r =sum - i - j;
        if(r>j && r<=n){
        count++;
        }
      }
    System.out.println(count);
    }
  }
  }
}