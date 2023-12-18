import java.util.*;

public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int n1 = n;
		int count=0;
		int j;
		for(int i=0 ; ;i++){
			n1=n;
			n1-=i*r;
			j=0;
			while(n1-j*g>=0){
				if(n1<0) break;
				if((n1-j*g)%b==0) count++;
				j++;
			}
			if(n1<0) break;
		}
		System.out.println(count);
		}
}