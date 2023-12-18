import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),sum=0;
    for(int i=1;i<=n;i++) {
    	for(int j=1;j<=n;j++) {
    		for(int k=1;k<=n;k++) {
    			int buff=GCD(i,j);
    			sum+=GCD(k,buff);
    		}
    	}
    }
    System.out.println(sum);
  }
	public static int GCD(int min,int max) {
		if(max%min==0)return min;
		else return GCD(max%min,min);
	}
}