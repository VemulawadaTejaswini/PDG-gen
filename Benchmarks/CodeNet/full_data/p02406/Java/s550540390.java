import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int co;
		for(co=1;co<=x;co++){
		if(co%3==0){System.out.print(" "+co);}
		else if(co%10==3){System.out.print(" "+co);}
	}
	System.out.println("");		
	}
}