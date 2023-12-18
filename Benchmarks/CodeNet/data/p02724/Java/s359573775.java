import java.util.*;


class Main{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		
		int happy = (x/500)*1000+(x%500/5)*5;
		
		System.out.println(happy);
		
		
	}
}
	


