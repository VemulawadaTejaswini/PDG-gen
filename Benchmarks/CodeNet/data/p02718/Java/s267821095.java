import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n=sc.nextInt(),m=sc.nextInt(),sum=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextInt();
    	sum+=a[i];
    }
    double f=sum/(4*m);
    boolean flag=true;
    for(int i=0;i<n;i++) {
    	if(a[i]<f) {
    		flag=false;
    	}
    }
    if(flag) {
    	System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
  }
}
