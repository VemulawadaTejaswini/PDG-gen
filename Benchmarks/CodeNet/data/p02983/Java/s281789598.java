
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int year1=sc.nextInt();
		int year2=sc.nextInt();
		
		int nums=0;
		int num=-1;
		for(int i=year1;i<=year2;i++) {
			for(int j=i+1;j<=year2;j++) {
				nums=i*j%2019;
				if(num==-1) {
					num=nums;
				}else {
					if(num>nums) {
						num=nums;
					}
				}
			}
		}
		System.out.println(num);
		
	}
}
