import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b,c,sum=0;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		for(int x=a;x<=b;x++){
			if(c%x==0){
				sum+=1;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}

