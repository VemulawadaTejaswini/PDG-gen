import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long multipleFive = 1,b=0;
		if(a%2 != 0)System.out.println("0");
		else{
			while(multipleFive<(a/2)){
				multipleFive*=5;
			}
			while(multipleFive>5){
				multipleFive/=5;
				b += ((a/2)/multipleFive);
			}
			System.out.println(b);
		}
	}
}