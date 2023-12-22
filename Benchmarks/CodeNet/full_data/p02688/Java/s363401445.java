import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<k;i++) {
    	int d=sc.nextInt();
    	for(int j=0;j<d;j++) {
    		a[sc.nextInt()-1]++;
    	}
    }
    int count=0;
    for(int i:a) {
    	if(i==0)count++;
    }
    System.out.println(count);
  }
}
