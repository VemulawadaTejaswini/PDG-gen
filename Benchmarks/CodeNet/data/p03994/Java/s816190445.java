import java.io.*;

import java.util.Scanner;



public class Main{
	static String int2Alpha(int num){
		if(num==97+0) return "a";
		if(num==97+1) return "b";
		if(num==97+2) return "c";
		if(num==97+3) return "d";
		if(num==97+4) return "e";
		if(num==97+5) return "f";
		if(num==97+6) return "g";
		if(num==97+7) return "h";
		if(num==97+8) return "i";
		if(num==97+9) return "j";
		if(num==97+10) return "k";
		if(num==97+11) return "l";
		if(num==97+12) return "m";
		if(num==97+13) return "n";
		if(num==97+14) return "o";
		if(num==97+15) return "p";
		if(num==97+16) return "q";
		if(num==97+17) return "r";
		if(num==97+18) return "s";
		if(num==97+19) return "t";
		if(num==97+20) return "u";
		if(num==97+21) return "v";
		if(num==97+22) return "w";
		if(num==97+23) return "x";
		if(num==97+24) return "y";
		if(num==97+25) return "z";
		return "hoe";
	}

	public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                String str=scanner.next();
		int k=scanner.nextInt();
int len=str.length();
		int[] dic=new int[len];

		for(int i=0;i<str.length();i++){
			dic[i]=str.charAt(i);
		}
		for(int i=0;i<str.length();i++){
			if(dic[i]!=97 && dic[i]+k>=123) {
				k=k-(123-dic[i]);
				dic[i]=97;
			}
		}
len--;
                dic[len]+=k;
while(dic[len]>122)dic[len]-=97;
		for(int i=0;i<str.length();i++){
			System.out.print(int2Alpha(dic[i]));
		}
	}
}