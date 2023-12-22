import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
			try{
				int n=scan.nextInt();
				int x=scan.nextInt();
				int ans=0;
				if(n==0 && x==0){
					break;
				}
				for(int i=n;i>=3;i--){
					if(i-2+i-1+i<x){
						break;
					}
					for(int j=i-1;j>=2;j--){
						if(x-i-j<j){
							if(0<x-i-j){
								ans+=1;
								//System.out.println((x-i-j)+" "+j+" "+i);
							}
						}else{
							break;
						}
					}
				}
				System.out.println(ans);
			}catch(NumberFormatException e){
				break;
			}
		}
	}
}