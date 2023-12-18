import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		boolean bl = false;
		int a = 0;
		int b = 0;
		for(int i=0; i<=Math.min(n, y/10000); i++){
			for(int j=0; j<=Math.min(n-i, (y-10000*i)/5000); i++){
				if(10000*i+5000*j+1000*(n-i-j)==y){
					a = i;
					b = j;
					bl = true;
					break;
				}
			}
			if(bl==true)break;
		}
		System.out.println(bl==true ? a +" "+ b + " " + (n-a-b) : "-1 -1 -1" );
	}
}