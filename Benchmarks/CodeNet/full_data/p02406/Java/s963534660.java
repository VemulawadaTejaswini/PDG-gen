import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i = 0;
	int n = sc.nextInt();
	while(++i <=n){
		int x = i;
	if (x % 3 ==0){
		System.out.printf(" %d",i);
	}else{
		while(x!=0){
		if(x % 10==3){
			System.out.printf(" %d",i);
			}
		x /=10;
		}	
	}
	}
	System.out.println();
}
}