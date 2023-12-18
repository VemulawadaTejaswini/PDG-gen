import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int n = keyboard.nextInt();
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int a7 = 0;
		int a8 = 0;
		int a9 = 0;
		int a10 = 0;
		int a11 = 0;
		int a12 = 0;
		int a13 = 0;
		int a14 = 0;
		int a15 = 0;
		int a16 = 0;
		int a17 = 0;
		int a18 = 0;
		int a19 = 0;
		int a20 = 0;
		
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		int b4 = 0;
		int b5 = 0;
		int b6 = 0;
		int b7 = 0;
		int b8 = 0;
		int b9 = 0;
		int b10 = 0;
		int b11 = 0;
		int b12 = 0;
		int b13 = 0;
		int b14 = 0;
		int b15 = 0;
		int b16 = 0;
		int b17 = 0;
		int b18 = 0;
		int b19 = 0;
		int b20 = 0;
		
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		int c6 = 0;
		int c7 = 0;
		int c8 = 0;
		int c9 = 0;
		int c10 = 0;
		int c11 = 0;
		int c12 = 0;
		int c13 = 0;
		int c14 = 0;
		int c15 = 0;
		int c16 = 0;
		int c17 = 0;
		int c18 = 0;
		int c19 = 0;
		
		int sum = 0;
		
		if( n == 2 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			
			sum = b1+b2;
			
			if( a2 == a1 + 1 ){
				sum = sum + c1;
			}		
		}
		
		if( n == 3 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			
			sum = b1 + b2 + b3;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
		}
		
		if( n == 4 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			
			sum = b1 + b2 + b3 + b4;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
		}
		
		if( n == 5 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			
			sum = b1 + b2 + b3 + b4 + b5;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
		}
		
		if( n == 6 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			
			sum = b1 + b2 + b3 + b4 + b5 + b6;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
		}
		
		if( n == 7 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
		}
		
		if( n == 8 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}

		}
		
		if( n == 9 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
		}
		
		if( n == 10 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
		}
		
		if( n == 11 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			a11 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			b11 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			c10 = keyboard.nextInt();
			
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
			if(a11 == a10 + 1){
				sum = sum + c10;
			}
		}	
		
		if( n == 12 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			a11 = keyboard.nextInt();
			a12 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			b11 = keyboard.nextInt();
			b12 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			c10 = keyboard.nextInt();
			c11 = keyboard.nextInt();			
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11 + b12;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
			if(a11 == a10 + 1){
				sum = sum + c10;
			}
			if(a12 == a11 + 1){
				sum = sum + c11;
			}
		}				
		if( n == 13 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			a11 = keyboard.nextInt();
			a12 = keyboard.nextInt();
			a13 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			b11 = keyboard.nextInt();
			b12 = keyboard.nextInt();
			b13 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			c10 = keyboard.nextInt();
			c11 = keyboard.nextInt();
			c12 = keyboard.nextInt();			
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11 + b12 + b13;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
			if(a11 == a10 + 1){
				sum = sum + c10;
			}
			if(a12 == a11 + 1){
				sum = sum + c11;
			}
			if(a13 == a12 + 1){
				sum = sum + c12;
			}
		}	
		if( n == 14 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			a11 = keyboard.nextInt();
			a12 = keyboard.nextInt();
			a13 = keyboard.nextInt();
			a14 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			b11 = keyboard.nextInt();
			b12 = keyboard.nextInt();
			b13 = keyboard.nextInt();
			b14 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			c10 = keyboard.nextInt();
			c11 = keyboard.nextInt();
			c12 = keyboard.nextInt();
			c13 = keyboard.nextInt();			
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11 + b12 + b13 + b14;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
			if(a11 == a10 + 1){
				sum = sum + c10;
			}
			if(a12 == a11 + 1){
				sum = sum + c11;
			}
			if(a13 == a12 + 1){
				sum = sum + c12;
			}
			if(a14 == a13 + 1){
				sum = sum + c13;
			}
		}	
		if( n == 15 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			a11 = keyboard.nextInt();
			a12 = keyboard.nextInt();
			a13 = keyboard.nextInt();
			a14 = keyboard.nextInt();
			b15 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			b11 = keyboard.nextInt();
			b12 = keyboard.nextInt();
			b13 = keyboard.nextInt();
			b14 = keyboard.nextInt();
			b15 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			c10 = keyboard.nextInt();
			c11 = keyboard.nextInt();
			c12 = keyboard.nextInt();
			c13 = keyboard.nextInt();
			c14 = keyboard.nextInt();			
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11 + b12 + b13 + b14 + b15;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
			if(a11 == a10 + 1){
				sum = sum + c10;
			}
			if(a12 == a11 + 1){
				sum = sum + c11;
			}
			if(a13 == a12 + 1){
				sum = sum + c12;
			}
			if(a14 == a13 + 1){
				sum = sum + c13;
			}
			if(a15 == a14 + 1){
				sum = sum + c14;
			}
		}
		if( n == 16 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			a11 = keyboard.nextInt();
			a12 = keyboard.nextInt();
			a13 = keyboard.nextInt();
			a14 = keyboard.nextInt();
			a15 = keyboard.nextInt();
			a16 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			b11 = keyboard.nextInt();
			b12 = keyboard.nextInt();
			b13 = keyboard.nextInt();
			b14 = keyboard.nextInt();
			b15 = keyboard.nextInt();
			b16 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			c10 = keyboard.nextInt();
			c11 = keyboard.nextInt();
			c12 = keyboard.nextInt();
			c13 = keyboard.nextInt();
			c14 = keyboard.nextInt();
			c15 = keyboard.nextInt();			
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11 + b12 + b13 + b14 + b15 + b16;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
			if(a11 == a10 + 1){
				sum = sum + c10;
			}
			if(a12 == a11 + 1){
				sum = sum + c11;
			}
			if(a13 == a12 + 1){
				sum = sum + c12;
			}
			if(a14 == a13 + 1){
				sum = sum + c13;
			}
			if(a15 == a14 + 1){
				sum = sum + c14;
			}
			if(a16 == a15 + 1){
				sum = sum + c15;
			}
		}
		if( n == 17 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			a11 = keyboard.nextInt();
			a12 = keyboard.nextInt();
			a13 = keyboard.nextInt();
			a14 = keyboard.nextInt();
			a15 = keyboard.nextInt();
			a16 = keyboard.nextInt();
			a17 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			b11 = keyboard.nextInt();
			b12 = keyboard.nextInt();
			b13 = keyboard.nextInt();
			b14 = keyboard.nextInt();
			b15 = keyboard.nextInt();
			b16 = keyboard.nextInt();
			b17 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			c10 = keyboard.nextInt();
			c11 = keyboard.nextInt();
			c12 = keyboard.nextInt();
			c13 = keyboard.nextInt();
			c14 = keyboard.nextInt();
			c15 = keyboard.nextInt();
			c16 = keyboard.nextInt();	
			
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11 + b12 + b13 + b14 + b15 + b16 + b17;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
			if(a11 == a10 + 1){
				sum = sum + c10;
			}
			if(a12 == a11 + 1){
				sum = sum + c11;
			}
			if(a13 == a12 + 1){
				sum = sum + c12;
			}
			if(a14 == a13 + 1){
				sum = sum + c13;
			}
			if(a15 == a14 + 1){
				sum = sum + c14;
			}
			if(a16 == a15 + 1){
				sum = sum + c15;
			}
			if(a17 == a16 + 1){
				sum = sum + c16;
			}
		}
		if( n == 18 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			a11 = keyboard.nextInt();
			a12 = keyboard.nextInt();
			a13 = keyboard.nextInt();
			a14 = keyboard.nextInt();
			a15 = keyboard.nextInt();
			a16 = keyboard.nextInt();
			a17 = keyboard.nextInt();
			a18 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			b11 = keyboard.nextInt();
			b12 = keyboard.nextInt();
			b13 = keyboard.nextInt();
			b14 = keyboard.nextInt();
			b15 = keyboard.nextInt();
			b16 = keyboard.nextInt();
			b17 = keyboard.nextInt();
			b18 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			c10 = keyboard.nextInt();
			c11 = keyboard.nextInt();
			c12 = keyboard.nextInt();
			c13 = keyboard.nextInt();
			c14 = keyboard.nextInt();
			c15 = keyboard.nextInt();
			c16 = keyboard.nextInt();	
			c17 = keyboard.nextInt();
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11 + b12 + b13 + b14 + b15 + b16 + b17 + b18;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
			if(a11 == a10 + 1){
				sum = sum + c10;
			}
			if(a12 == a11 + 1){
				sum = sum + c11;
			}
			if(a13 == a12 + 1){
				sum = sum + c12;
			}
			if(a14 == a13 + 1){
				sum = sum + c13;
			}
			if(a15 == a14 + 1){
				sum = sum + c14;
			}
			if(a16 == a15 + 1){
				sum = sum + c15;
			}
			if(a17 == a16 + 1){
				sum = sum + c16;
			}
			if(a18 == a17 + 1){
				sum = sum + c17;
			}
		}
		if( n == 19 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			a11 = keyboard.nextInt();
			a12 = keyboard.nextInt();
			a13 = keyboard.nextInt();
			a14 = keyboard.nextInt();
			a15 = keyboard.nextInt();
			a16 = keyboard.nextInt();
			a17 = keyboard.nextInt();
			a18 = keyboard.nextInt();
			a19 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			b11 = keyboard.nextInt();
			b12 = keyboard.nextInt();
			b13 = keyboard.nextInt();
			b14 = keyboard.nextInt();
			b15 = keyboard.nextInt();
			b16 = keyboard.nextInt();
			b17 = keyboard.nextInt();
			b18 = keyboard.nextInt();
			b19 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			c10 = keyboard.nextInt();
			c11 = keyboard.nextInt();
			c12 = keyboard.nextInt();
			c13 = keyboard.nextInt();
			c14 = keyboard.nextInt();
			c15 = keyboard.nextInt();
			c16 = keyboard.nextInt();	
			c17 = keyboard.nextInt();
			c18 = keyboard.nextInt();
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11 + b12 + b13 + b14 + b15 + b16 + b17 + b18 + b19;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
			if(a11 == a10 + 1){
				sum = sum + c10;
			}
			if(a12 == a11 + 1){
				sum = sum + c11;
			}
			if(a13 == a12 + 1){
				sum = sum + c12;
			}
			if(a14 == a13 + 1){
				sum = sum + c13;
			}
			if(a15 == a14 + 1){
				sum = sum + c14;
			}
			if(a16 == a15 + 1){
				sum = sum + c15;
			}
			if(a17 == a16 + 1){
				sum = sum + c16;
			}
			if(a18 == a17 + 1){
				sum = sum + c17;
			}
			if(a19 == a18 + 1){
				sum = sum + c18;
			}
		}
		if( n == 20 ){
			a1 = keyboard.nextInt();
			a2 = keyboard.nextInt();
			a3 = keyboard.nextInt();
			a4 = keyboard.nextInt();
			a5 = keyboard.nextInt();
			a6 = keyboard.nextInt();
			a7 = keyboard.nextInt();
			a8 = keyboard.nextInt();
			a9 = keyboard.nextInt();
			a10 = keyboard.nextInt();
			a11 = keyboard.nextInt();
			a12 = keyboard.nextInt();
			a13 = keyboard.nextInt();
			a14 = keyboard.nextInt();
			a15 = keyboard.nextInt();
			a16 = keyboard.nextInt();
			a17 = keyboard.nextInt();
			a18 = keyboard.nextInt();
			a19 = keyboard.nextInt();
			a20 = keyboard.nextInt();
			b1 = keyboard.nextInt();
			b2 = keyboard.nextInt();
			b3 = keyboard.nextInt();
			b4 = keyboard.nextInt();
			b5 = keyboard.nextInt();
			b6 = keyboard.nextInt();
			b7 = keyboard.nextInt();
			b8 = keyboard.nextInt();
			b9 = keyboard.nextInt();
			b10 = keyboard.nextInt();
			b11 = keyboard.nextInt();
			b12 = keyboard.nextInt();
			b13 = keyboard.nextInt();
			b14 = keyboard.nextInt();
			b15 = keyboard.nextInt();
			b16 = keyboard.nextInt();
			b17 = keyboard.nextInt();
			b18 = keyboard.nextInt();
			b19 = keyboard.nextInt();
			b20 = keyboard.nextInt();
			c1 = keyboard.nextInt();
			c2 = keyboard.nextInt();
			c3 = keyboard.nextInt();
			c4 = keyboard.nextInt();
			c5 = keyboard.nextInt();
			c6 = keyboard.nextInt();
			c7 = keyboard.nextInt();
			c8 = keyboard.nextInt();
			c9 = keyboard.nextInt();
			c10 = keyboard.nextInt();
			c11 = keyboard.nextInt();
			c12 = keyboard.nextInt();
			c13 = keyboard.nextInt();
			c14 = keyboard.nextInt();
			c15 = keyboard.nextInt();
			c16 = keyboard.nextInt();	
			c17 = keyboard.nextInt();
			c18 = keyboard.nextInt();
			c19 = keyboard.nextInt();
			
			sum = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8 + b9 + b10 + b11 + b12 + b13 + b14 + b15 + b16 + b17 + b18 + b19 +b20;
			
			if(a2 == a1 + 1){
				sum = sum + c1;
			}
			if(a3 == a2 + 1){
				sum = sum + c2;
			}
			if(a4 == a3 + 1){
				sum = sum + c3;
			}
			if(a5 == a4 + 1){
				sum = sum + c4;
			}
			if(a6 == a5 + 1){
				sum = sum + c5;
			}
			if(a7 == a6 + 1){
				sum = sum + c6;
			}
			if(a8 == a7 + 1){
				sum = sum + c7;
			}
			if(a9 == a8 + 1){
				sum = sum + c8;
			}
			if(a10 == a9 + 1){
				sum = sum + c9;
			}
			if(a11 == a10 + 1){
				sum = sum + c10;
			}
			if(a12 == a11 + 1){
				sum = sum + c11;
			}
			if(a13 == a12 + 1){
				sum = sum + c12;
			}
			if(a14 == a13 + 1){
				sum = sum + c13;
			}
			if(a15 == a14 + 1){
				sum = sum + c14;
			}
			if(a16 == a15 + 1){
				sum = sum + c15;
			}
			if(a17 == a16 + 1){
				sum = sum + c16;
			}
			if(a18 == a17 + 1){
				sum = sum + c17;
			}
			if(a19 == a18 + 1){
				sum = sum + c18;
			}
			if(a20 == a19 + 1){
				sum = sum + c19;
			}
		}
		
		System.out.println(sum);
		
	}
}