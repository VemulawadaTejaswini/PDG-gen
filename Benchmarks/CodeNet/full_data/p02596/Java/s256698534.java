import java.util.Scanner;

class Main{
  public static void main(String[] args){
  	Scanner scanner = new Scanner(System.in);

	int k= scanner.nextInt();
    int[] a = new int[1000000];
    int count = -1;
    
    a[0] = k%7;
    
    for(int i=1;i<=k;i++) a[i-1] = ((a[i]*10)+7) % 7;
    for(int i=0;i<=k;i++) if((a[i]%k)==0) count = i;
    
    System.out.println(count);
  }
}