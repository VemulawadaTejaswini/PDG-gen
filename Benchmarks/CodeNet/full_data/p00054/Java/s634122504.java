import java.util.*;
public class Main {

    public static void main(String[] ano) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	double a =scan.nextInt();
        	double b =scan.nextInt();
        	int n =scan.nextInt();
        	int s=0;
        	for(int i=1;i<=n;i++){
        		s+=((int)(a/b*Math.pow(10, i))%10);
        	}
        	System.out.println(s);
        }
}
}