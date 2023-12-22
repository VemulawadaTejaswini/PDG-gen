import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,j,a=0,x=0,f=0;
        int n=scan.nextInt();
        if(n>=1 && n<=10000){
        	for(i=0;i<n;i++){
        		a=scan.nextInt();
        		if(a<2)continue;
        		for(j=2;j<a;j++){
        			if(a%j==0){
        				f=1;
        				break;
        			}
        		}
        		if(f==0)x++;
        		else f=0;
        	}
        	System.out.println(x);
        }
    }
}