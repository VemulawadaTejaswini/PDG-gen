import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n<2){
				System.out.println("0");
			}else if(n==2){
				System.out.println("1");
			}else{
				int count=1;
				for(int i=3;i<=n;i+=2){
					boolean result=true;
					for(int j=3;j<=Math.sqrt(i);j+=2){
						if(i%j==0){
							result=false;
							break;
						}
					}
					if(result){
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}