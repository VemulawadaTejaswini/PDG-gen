import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int count=0;
			int n=sc.nextInt();
			for(int i=2;i<=n;i++){
				boolean result=true;
				for(int j=2;j<i;j++){
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