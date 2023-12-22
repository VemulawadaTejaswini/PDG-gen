import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int h,w;
	while(true){
		h=sc.nextInt();
		w=sc.nextInt();
		if(h==0&&w==0) break;
		for(int i=1;i<=h;i++){
			if(i%2==1)
			{
				for(int j=1;j<=w;j++){
					if(j%2==1) System.out.printf("#");
					else System.out.printf(".");
				}
			}else{
				for(int j=1;j<=w;j++){
					if(j%2==1) System.out.printf(".");
					else System.out.printf("#");
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n");
	}
	}
}