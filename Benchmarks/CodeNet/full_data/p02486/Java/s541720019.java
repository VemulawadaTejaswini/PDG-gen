import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int y = 0;
		int i,j,k;
		while(a == 0){
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n==0){
				if(x==0){
					break;
				}
			}
			for(i=1;i<=n;i++){
				for(j=i+1;j<=n;j++){
					for(k=j+1;k<=n;k++){
						if(i+j+k==x){
							y++;
						}
					}
				}
			}
			System.out.println(y);
		}
		
	}
}