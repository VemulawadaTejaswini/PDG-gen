import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
			try{
				int m=scan.nextInt();
				int f=scan.nextInt();
				int r=scan.nextInt();
				String score;
				if(m+f+r==-3){
					break;
				}
				if(m==0 || f==0 || m+f<30){
					score="F";
				}
				else{
					if(m+f>=80){
						score="A";
					}else if(65<=m+f && m+f<80){
						score="B";
					}else if(r<=50 || 30<=m+f && m+f<65){
						score="C";
					}else{
						score="D";
					}
				}
				System.out.println(score);
			}catch(NumberFormatException e){
				break;
			}
		}
	}
}