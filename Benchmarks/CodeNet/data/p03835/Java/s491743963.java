import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int sum = 0;
		for(int i=0;i<=a;i++){
			for(int j=0;j<=a;j++){
				for(int k=0;k<=a;k++){
					if(i+j+k==b){
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
