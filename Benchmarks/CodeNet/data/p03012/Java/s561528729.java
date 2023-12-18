import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int [] a = new int [n];
    int total = 0;
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      total += a[i];
    }
    int sum = 0;
    int i = 0;
    while(true){
      sum += a[i];
      i++;
      if(total - sum <= sum) break;
    }
    int ans = 2*sum-total;
    if(ans > (total -2*sum+2*a[i])) ans = total -2*sum-2*a[i]; 
    System.out.println(ans);
  }
}