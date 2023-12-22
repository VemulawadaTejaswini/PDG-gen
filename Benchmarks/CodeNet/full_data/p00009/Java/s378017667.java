import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int ptr=0;
			int[] prime=new int[500000];
			prime[ptr++]=2;
			prime[ptr++]=3;
			for(int i=5;i<=n;i+=2){
				int j;
				double sqrtn=Math.sqrt(i);
				for(j=1;j<ptr;j++){
					if(i%prime[j]==0||prime[j]>sqrtn){
						break;
					}
				}
				if(prime[j]>sqrtn){
					prime[ptr++]=i;
				}
			}
			if(n<=1){
				System.out.println(0);
			}
			else if(n==2){
				System.out.println(1);
			}else if(n==3){
				System.out.println(2);
			}else{
				System.out.println(ptr);
			}
		}
	}
}