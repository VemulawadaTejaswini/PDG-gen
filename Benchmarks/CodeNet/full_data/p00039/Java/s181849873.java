import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String a=s.next();
			int sum=0;
			int table[]=new int[a.length()];
			for(int i=0;i<a.length();i++){
				switch(a.charAt(i)){
					case 'I':
						table[i]=1;
						break;
					case 'V':
						table[i]=5;
						break;
					case 'X':
						table[i]=10;
						break;
					case 'L':
						table[i]=50;
						break;
					case 'C':
						table[i]=100;
						break;
					case 'D':
						table[i]=500;
						break;
					case 'M':
						table[i]=1000;
						break;
				}
			}
			for(int i=0;i<a.length();i++){
				if(i<a.length()-1&&table[i]<table[i+1])sum-=table[i];
				else sum+=table[i];
			}
			System.out.println(sum);
		}
	}
}