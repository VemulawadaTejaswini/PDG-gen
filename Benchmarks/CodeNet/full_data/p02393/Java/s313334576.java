import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a<b){
		if(b<c){
			System.out.println("%d %d %d",a,b,c);
			}else if(a<c){
				if(c<b){
					System.out.println("%d %d %d",a,c,b);
				}
				}else{
				if(c<a){
					System.out.println("%d %d %d",c,a,b);
				}	
			}
	}
}
}