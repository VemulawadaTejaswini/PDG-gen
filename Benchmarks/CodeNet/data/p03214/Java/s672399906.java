import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),res=0;
    double[] a=new double[n];
    double ave=0,sum=0,min=Double.MAX_VALUE;
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextDouble();
    	sum+=a[i];
    }
    ave=sum/n;
    for(int i=0;i<n;i++) {
    	if(min>Math.abs(a[i]-ave)) {
    		min=Math.abs(a[i]-ave);
    		res=i;
    	}
    }
    System.out.println(res);
  }
}
