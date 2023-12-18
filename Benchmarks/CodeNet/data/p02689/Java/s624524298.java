import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),m=sc.nextInt(),count=0;
    int[] h=new int[n];
    int[] a=new int[n],buff1=new int[m],buff2=new int[m];
    for(int i=0;i<n;i++) {
    	h[i]=sc.nextInt();
    	a[i]=h[i];
    }

    for(int i=0;i<m;i++) {
    	buff1[i]=sc.nextInt()-1;
    	buff2[i]=sc.nextInt()-1;
    	a[buff1[i]]=Math.max(a[buff1[i]], h[buff2[i]]);
    	a[buff2[i]]=Math.max(a[buff1[i]], h[buff2[i]]);
    }
    for(int i=0;i<n;i++) {
    	if(a[i]==h[i])count++;
    	//System.out.print(a[i]+" ");
    }
    System.out.println(count);
  }
}
