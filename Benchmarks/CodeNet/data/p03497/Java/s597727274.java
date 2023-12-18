import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt(),count=0;
    long[] a=new long[n];
    long res=0;
    for(int i=0;i<n;i++) {
    	a[sc.nextInt()-1]++;
    }
    for(int i=0;i<n;i++) {
    	if(a[i]!=0)count++;
    }
    if(count-k<=0) {
    	System.out.println(0);
    }else {
    	Arrays.sort(a);
    	int i=0;
    	while(count-k>0) {
    		res+=a[i];
    		if(a[i]!=0) {
    			count--;
    		}
    		i++;
    	}
    	System.out.println(res);
    }
  }
}
