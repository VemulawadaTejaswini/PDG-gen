import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int count=0;
			int min=2;
			int max=n-2;
			while(min<=max){
				if(prime(min)&&prime(max)){
					count++;
				}
				min++;
				max--;
			}
			System.out.println(count);
		}
	}
	static boolean prime(int n){
		if(n==2){
			return true;
		}else if(n%2==0){
			return false;
		}else{
			boolean flag=true;
			for(int i=3;i<Math.sqrt(n)+1;i+=2){
				if(n%i==0){
					flag=false;
					break;
				}
			}
			return flag;
		}
	}
}