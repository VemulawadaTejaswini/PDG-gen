import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j,a,x=0,f=0;
        for(i=0;i<n;i++){
        	f=0;
        	a=scan.nextInt();
        	for(j=a-1;j>1;j--){
        		if(a%j==0){
        			f=1;
        			break;
        		}
        	}
        	if(f==0){
        		x++;
        	}
        }
        System.out.println(x);
    }
}