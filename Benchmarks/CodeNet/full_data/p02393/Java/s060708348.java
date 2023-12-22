import java.util.Scanner;
class Main {
	public static void main(String[] args){
		 Scanner scn = new Scanner(System.in);
		    int a = scn.nextInt();
		    int b = scn.nextInt();
		    int c = scn.nextInt();

	    	 if(c>b&b>a){
			     System.out.println(a+" "+b+" "+c);
			 }
			 if(b>c&c>a){
				 System.out.println(a+" "+c+" "+b);
			 }
			 if(a>c&c>b){
				 System.out.println(b+" "+c+" "+a);
			 }
			 if(c>a&a>b){
				 System.out.println(b+" "+a+" "+c);
			 }
			 if(b>a&a>c){
				 System.out.println(c+" "+a+" "+b);
			 }
			 if(a>b&b>c){
				 System.out.println(c+" "+b+" "+a);
			 }
			 if(a==b&b==c){
				 System.out.println(a+" "+a+" "+a);
			 }
			 if(a==b&b>c){
				 System.out.println(c+" "+a+" "+a);
			 }
			 if(a==b&c>b){
				 System.out.println(a+" "+a+" "+c);
			 }

			 if(a>c&b==c){
				 System.out.println(b+" "+b+" "+a);
			 }
			 if(c>a&b==c){
				 System.out.println(a+" "+b+" "+b);
			 }
	}
}