import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,x,sum=0,i,j,k,count;
        while(true) {
        	count=0;
        	n=scan.nextInt();
        	x=scan.nextInt();
        	if(n==0 && x==0) {
        		break;
        	}
        	for(i=1;i<=n;i++) {
        		for(j=i+1;j<=n;j++) {
        			for(k=j+1;k<=n;k++) {
        				sum=i+j+k;
        				if(sum==x)count++;
        			}
        		}
        	}
        	System.out.println(count);
        }
    }
}

