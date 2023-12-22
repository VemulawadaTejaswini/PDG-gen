import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean[] leapYearFlag=new boolean[3000];
		for(int i=0;i<3000;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				leapYearFlag[i]=true;
			}
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(true){
			boolean flag=false;
			for(int i=a;i<=b;i++){
				if(leapYearFlag[i]){
					System.out.println(i);
					flag=true;
				}
			}
			if(!flag){
				System.out.println("NA");
			}
			a=sc.nextInt();
			b=sc.nextInt();
			if(a==0&&b==0){
				break;
			}else{
				System.out.println();
			}
		}
	}
}