import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong(),sum=0,i=0;
		while(sum<x){
			if(i%2==0)sum+=6;
			else if(i%2==1)sum+=5;
			i++;
		}
		System.out.println(i);
	}
}