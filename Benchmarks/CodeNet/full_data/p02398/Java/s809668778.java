import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int s = 0;
	if(a<b) {
		for(;a<=b;a++){
			if(c % a == 0) s= s + 1;
		}
			
		
			}
	else if(a>b);{
		for(; b<=a;b++){
			if(c% b == 0)s=s+1;}
	}
	if(a==b)
		if(c % a == 0) s = s+1;	
	System.out.println(s);
	}
}