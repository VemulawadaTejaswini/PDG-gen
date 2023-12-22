import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=1;i<=x;i++){
			int check=i;
			if(check%3==0){
				System.out.print(" "+i);
			}else{
				while(check>2){
					int y=check%10;
					if(y==3){
						System.out.print(" "+i);
					}
					check=check/10;
				}
			}
		}
	}
}
