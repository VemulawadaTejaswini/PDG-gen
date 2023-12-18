import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n=sc.nextInt(),p=sc.nextInt(),counto=0,counte=0;
    for(int i=0;i<n;i++) {
    	if(sc.nextInt()%2==0)counte++;
    	else counto++;
    }
    if(p==0) {
    	System.out.println((long)((counto*(counto-1)/2+1)*(Math.pow(2, counte))));
    }else {
    	System.out.println((long)((counto+counto*(counto-1)*(counto-2)/6)*Math.pow(2, counte)));
    }
  }
}
