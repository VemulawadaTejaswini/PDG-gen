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
				if(a1 == 1){
					sum = sum + c1;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
			}
			if(a11 == a10 + 1){
				if(a10 == 1){
					sum = sum + c1;
				}
				if(a10 == 2){
					sum = sum + c2;
				}
				if(a10 == 3){
					sum = sum + c3;
				}
				if(a10 == 4){
					sum = sum + c4;
				}
				if(a10 == 5){
					sum = sum + c5;
				}
				if(a10 == 6){
					sum = sum + c6;
				}
				if(a10 == 7){
					sum = sum + c7;
				}
				if(a10 == 8){
					sum = sum + c8;
				}
				if(a10 == 9){
					sum = sum + c9;
				}
				if(a10 == 10){
					sum = sum + c10;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
			}
			if(a11 == a10 + 1){
				if(a10 == 1){
					sum = sum + c1;
				}
				if(a10 == 2){
					sum = sum + c2;
				}
				if(a10 == 3){
					sum = sum + c3;
				}
				if(a10 == 4){
					sum = sum + c4;
				}
				if(a10 == 5){
					sum = sum + c5;
				}
				if(a10 == 6){
					sum = sum + c6;
				}
				if(a10 == 7){
					sum = sum + c7;
				}
				if(a10 == 8){
					sum = sum + c8;
				}
				if(a10 == 9){
					sum = sum + c9;
				}
				if(a10 == 10){
					sum = sum + c10;
				}
			}
			if(a12 == a11 + 1){
				if(a11 == 1){
					sum = sum + c1;
				}
				if(a11 == 2){
					sum = sum + c2;
				}
				if(a11 == 3){
					sum = sum + c3;
				}
				if(a11 == 4){
					sum = sum + c4;
				}
				if(a11 == 5){
					sum = sum + c5;
				}
				if(a11 == 6){
					sum = sum + c6;
				}
				if(a11 == 7){
					sum = sum + c7;
				}
				if(a11 == 8){
					sum = sum + c8;
				}
				if(a11 == 9){
					sum = sum + c9;
				}
				if(a11 == 10){
					sum = sum + c10;
				}
				if(a11 == 11){
					sum = sum + c11;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
			}
			if(a11 == a10 + 1){
				if(a10 == 1){
					sum = sum + c1;
				}
				if(a10 == 2){
					sum = sum + c2;
				}
				if(a10 == 3){
					sum = sum + c3;
				}
				if(a10 == 4){
					sum = sum + c4;
				}
				if(a10 == 5){
					sum = sum + c5;
				}
				if(a10 == 6){
					sum = sum + c6;
				}
				if(a10 == 7){
					sum = sum + c7;
				}
				if(a10 == 8){
					sum = sum + c8;
				}
				if(a10 == 9){
					sum = sum + c9;
				}
				if(a10 == 10){
					sum = sum + c10;
				}
			}
			if(a12 == a11 + 1){
				if(a11 == 1){
					sum = sum + c1;
				}
				if(a11 == 2){
					sum = sum + c2;
				}
				if(a11 == 3){
					sum = sum + c3;
				}
				if(a11 == 4){
					sum = sum + c4;
				}
				if(a11 == 5){
					sum = sum + c5;
				}
				if(a11 == 6){
					sum = sum + c6;
				}
				if(a11 == 7){
					sum = sum + c7;
				}
				if(a11 == 8){
					sum = sum + c8;
				}
				if(a11 == 9){
					sum = sum + c9;
				}
				if(a11 == 10){
					sum = sum + c10;
				}
				if(a11 == 11){
					sum = sum + c11;
				}
			}
			if(a13 == a12 + 1){
				if(a12 == 1){
					sum = sum + c1;
				}
				if(a12 == 2){
					sum = sum + c2;
				}
				if(a12 == 3){
					sum = sum + c3;
				}
				if(a12 == 4){
					sum = sum + c4;
				}
				if(a12 == 5){
					sum = sum + c5;
				}
				if(a12 == 6){
					sum = sum + c6;
				}
				if(a12 == 7){
					sum = sum + c7;
				}
				if(a12 == 8){
					sum = sum + c8;
				}
				if(a12 == 9){
					sum = sum + c9;
				}
				if(a12 == 10){
					sum = sum + c10;
				}
				if(a12 == 11){
					sum = sum + c11;
				}
				if(a12 == 12){
					sum = sum + c12;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
			}
			if(a11 == a10 + 1){
				if(a10 == 1){
					sum = sum + c1;
				}
				if(a10 == 2){
					sum = sum + c2;
				}
				if(a10 == 3){
					sum = sum + c3;
				}
				if(a10 == 4){
					sum = sum + c4;
				}
				if(a10 == 5){
					sum = sum + c5;
				}
				if(a10 == 6){
					sum = sum + c6;
				}
				if(a10 == 7){
					sum = sum + c7;
				}
				if(a10 == 8){
					sum = sum + c8;
				}
				if(a10 == 9){
					sum = sum + c9;
				}
				if(a10 == 10){
					sum = sum + c10;
				}
			}
			if(a12 == a11 + 1){
				if(a11 == 1){
					sum = sum + c1;
				}
				if(a11 == 2){
					sum = sum + c2;
				}
				if(a11 == 3){
					sum = sum + c3;
				}
				if(a11 == 4){
					sum = sum + c4;
				}
				if(a11 == 5){
					sum = sum + c5;
				}
				if(a11 == 6){
					sum = sum + c6;
				}
				if(a11 == 7){
					sum = sum + c7;
				}
				if(a11 == 8){
					sum = sum + c8;
				}
				if(a11 == 9){
					sum = sum + c9;
				}
				if(a11 == 10){
					sum = sum + c10;
				}
				if(a11 == 11){
					sum = sum + c11;
				}
			}
			if(a13 == a12 + 1){
				if(a12 == 1){
					sum = sum + c1;
				}
				if(a12 == 2){
					sum = sum + c2;
				}
				if(a12 == 3){
					sum = sum + c3;
				}
				if(a12 == 4){
					sum = sum + c4;
				}
				if(a12 == 5){
					sum = sum + c5;
				}
				if(a12 == 6){
					sum = sum + c6;
				}
				if(a12 == 7){
					sum = sum + c7;
				}
				if(a12 == 8){
					sum = sum + c8;
				}
				if(a12 == 9){
					sum = sum + c9;
				}
				if(a12 == 10){
					sum = sum + c10;
				}
				if(a12 == 11){
					sum = sum + c11;
				}
				if(a12 == 12){
					sum = sum + c12;
				}
			}
			if(a14 == a13 + 1){
				if(a13 == 1){
					sum = sum + c1;
				}
				if(a13 == 2){
					sum = sum + c2;
				}
				if(a13 == 3){
					sum = sum + c3;
				}
				if(a13 == 4){
					sum = sum + c4;
				}
				if(a13 == 5){
					sum = sum + c5;
				}
				if(a13 == 6){
					sum = sum + c6;
				}
				if(a13 == 7){
					sum = sum + c7;
				}
				if(a13 == 8){
					sum = sum + c8;
				}
				if(a13 == 9){
					sum = sum + c9;
				}
				if(a13 == 10){
					sum = sum + c10;
				}
				if(a13 == 11){
					sum = sum + c11;
				}
				if(a13 == 12){
					sum = sum + c12;
				}
				if(a13 == 13){
					sum = sum + c13;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
			}
			if(a11 == a10 + 1){
				if(a10 == 1){
					sum = sum + c1;
				}
				if(a10 == 2){
					sum = sum + c2;
				}
				if(a10 == 3){
					sum = sum + c3;
				}
				if(a10 == 4){
					sum = sum + c4;
				}
				if(a10 == 5){
					sum = sum + c5;
				}
				if(a10 == 6){
					sum = sum + c6;
				}
				if(a10 == 7){
					sum = sum + c7;
				}
				if(a10 == 8){
					sum = sum + c8;
				}
				if(a10 == 9){
					sum = sum + c9;
				}
				if(a10 == 10){
					sum = sum + c10;
				}
			}
			if(a12 == a11 + 1){
				if(a11 == 1){
					sum = sum + c1;
				}
				if(a11 == 2){
					sum = sum + c2;
				}
				if(a11 == 3){
					sum = sum + c3;
				}
				if(a11 == 4){
					sum = sum + c4;
				}
				if(a11 == 5){
					sum = sum + c5;
				}
				if(a11 == 6){
					sum = sum + c6;
				}
				if(a11 == 7){
					sum = sum + c7;
				}
				if(a11 == 8){
					sum = sum + c8;
				}
				if(a11 == 9){
					sum = sum + c9;
				}
				if(a11 == 10){
					sum = sum + c10;
				}
				if(a11 == 11){
					sum = sum + c11;
				}
			}
			if(a13 == a12 + 1){
				if(a12 == 1){
					sum = sum + c1;
				}
				if(a12 == 2){
					sum = sum + c2;
				}
				if(a12 == 3){
					sum = sum + c3;
				}
				if(a12 == 4){
					sum = sum + c4;
				}
				if(a12 == 5){
					sum = sum + c5;
				}
				if(a12 == 6){
					sum = sum + c6;
				}
				if(a12 == 7){
					sum = sum + c7;
				}
				if(a12 == 8){
					sum = sum + c8;
				}
				if(a12 == 9){
					sum = sum + c9;
				}
				if(a12 == 10){
					sum = sum + c10;
				}
				if(a12 == 11){
					sum = sum + c11;
				}
				if(a12 == 12){
					sum = sum + c12;
				}
			}
			if(a14 == a13 + 1){
				if(a13 == 1){
					sum = sum + c1;
				}
				if(a13 == 2){
					sum = sum + c2;
				}
				if(a13 == 3){
					sum = sum + c3;
				}
				if(a13 == 4){
					sum = sum + c4;
				}
				if(a13 == 5){
					sum = sum + c5;
				}
				if(a13 == 6){
					sum = sum + c6;
				}
				if(a13 == 7){
					sum = sum + c7;
				}
				if(a13 == 8){
					sum = sum + c8;
				}
				if(a13 == 9){
					sum = sum + c9;
				}
				if(a13 == 10){
					sum = sum + c10;
				}
				if(a13 == 11){
					sum = sum + c11;
				}
				if(a13 == 12){
					sum = sum + c12;
				}
				if(a13 == 13){
					sum = sum + c13;
				}
			}
			if(a15 == a14 + 1){
				if(a14 == 1){
					sum = sum + c1;
				}
				if(a14 == 2){
					sum = sum + c2;
				}
				if(a14 == 3){
					sum = sum + c3;
				}
				if(a14 == 4){
					sum = sum + c4;
				}
				if(a14 == 5){
					sum = sum + c5;
				}
				if(a14 == 6){
					sum = sum + c6;
				}
				if(a14 == 7){
					sum = sum + c7;
				}
				if(a14 == 8){
					sum = sum + c8;
				}
				if(a14 == 9){
					sum = sum + c9;
				}
				if(a14 == 10){
					sum = sum + c10;
				}
				if(a14 == 11){
					sum = sum + c11;
				}
				if(a14 == 12){
					sum = sum + c12;
				}
				if(a14 == 13){
					sum = sum + c13;
				}
				if(a14 == 14){
					sum = sum + c14;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
			}
			if(a11 == a10 + 1){
				if(a10 == 1){
					sum = sum + c1;
				}
				if(a10 == 2){
					sum = sum + c2;
				}
				if(a10 == 3){
					sum = sum + c3;
				}
				if(a10 == 4){
					sum = sum + c4;
				}
				if(a10 == 5){
					sum = sum + c5;
				}
				if(a10 == 6){
					sum = sum + c6;
				}
				if(a10 == 7){
					sum = sum + c7;
				}
				if(a10 == 8){
					sum = sum + c8;
				}
				if(a10 == 9){
					sum = sum + c9;
				}
				if(a10 == 10){
					sum = sum + c10;
				}
			}
			if(a12 == a11 + 1){
				if(a11 == 1){
					sum = sum + c1;
				}
				if(a11 == 2){
					sum = sum + c2;
				}
				if(a11 == 3){
					sum = sum + c3;
				}
				if(a11 == 4){
					sum = sum + c4;
				}
				if(a11 == 5){
					sum = sum + c5;
				}
				if(a11 == 6){
					sum = sum + c6;
				}
				if(a11 == 7){
					sum = sum + c7;
				}
				if(a11 == 8){
					sum = sum + c8;
				}
				if(a11 == 9){
					sum = sum + c9;
				}
				if(a11 == 10){
					sum = sum + c10;
				}
				if(a11 == 11){
					sum = sum + c11;
				}
			}
			if(a13 == a12 + 1){
				if(a12 == 1){
					sum = sum + c1;
				}
				if(a12 == 2){
					sum = sum + c2;
				}
				if(a12 == 3){
					sum = sum + c3;
				}
				if(a12 == 4){
					sum = sum + c4;
				}
				if(a12 == 5){
					sum = sum + c5;
				}
				if(a12 == 6){
					sum = sum + c6;
				}
				if(a12 == 7){
					sum = sum + c7;
				}
				if(a12 == 8){
					sum = sum + c8;
				}
				if(a12 == 9){
					sum = sum + c9;
				}
				if(a12 == 10){
					sum = sum + c10;
				}
				if(a12 == 11){
					sum = sum + c11;
				}
				if(a12 == 12){
					sum = sum + c12;
				}
			}
			if(a14 == a13 + 1){
				if(a13 == 1){
					sum = sum + c1;
				}
				if(a13 == 2){
					sum = sum + c2;
				}
				if(a13 == 3){
					sum = sum + c3;
				}
				if(a13 == 4){
					sum = sum + c4;
				}
				if(a13 == 5){
					sum = sum + c5;
				}
				if(a13 == 6){
					sum = sum + c6;
				}
				if(a13 == 7){
					sum = sum + c7;
				}
				if(a13 == 8){
					sum = sum + c8;
				}
				if(a13 == 9){
					sum = sum + c9;
				}
				if(a13 == 10){
					sum = sum + c10;
				}
				if(a13 == 11){
					sum = sum + c11;
				}
				if(a13 == 12){
					sum = sum + c12;
				}
				if(a13 == 13){
					sum = sum + c13;
				}
			}
			if(a15 == a14 + 1){
				if(a14 == 1){
					sum = sum + c1;
				}
				if(a14 == 2){
					sum = sum + c2;
				}
				if(a14 == 3){
					sum = sum + c3;
				}
				if(a14 == 4){
					sum = sum + c4;
				}
				if(a14 == 5){
					sum = sum + c5;
				}
				if(a14 == 6){
					sum = sum + c6;
				}
				if(a14 == 7){
					sum = sum + c7;
				}
				if(a14 == 8){
					sum = sum + c8;
				}
				if(a14 == 9){
					sum = sum + c9;
				}
				if(a14 == 10){
					sum = sum + c10;
				}
				if(a14 == 11){
					sum = sum + c11;
				}
				if(a14 == 12){
					sum = sum + c12;
				}
				if(a14 == 13){
					sum = sum + c13;
				}
				if(a14 == 14){
					sum = sum + c14;
				}
			}
			if(a16 == a15 + 1){
				if(a15 == 1){
					sum = sum + c1;
				}
				if(a15 == 2){
					sum = sum + c2;
				}
				if(a15 == 3){
					sum = sum + c3;
				}
				if(a15 == 4){
					sum = sum + c4;
				}
				if(a15 == 5){
					sum = sum + c5;
				}
				if(a15 == 6){
					sum = sum + c6;
				}
				if(a15 == 7){
					sum = sum + c7;
				}
				if(a15 == 8){
					sum = sum + c8;
				}
				if(a15 == 9){
					sum = sum + c9;
				}
				if(a15 == 10){
					sum = sum + c10;
				}
				if(a15 == 11){
					sum = sum + c11;
				}
				if(a15 == 12){
					sum = sum + c12;
				}
				if(a15 == 13){
					sum = sum + c13;
				}
				if(a15 == 14){
					sum = sum + c14;
				}
				if(a15 == 15){
					sum = sum + c15;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
			}
			if(a11 == a10 + 1){
				if(a10 == 1){
					sum = sum + c1;
				}
				if(a10 == 2){
					sum = sum + c2;
				}
				if(a10 == 3){
					sum = sum + c3;
				}
				if(a10 == 4){
					sum = sum + c4;
				}
				if(a10 == 5){
					sum = sum + c5;
				}
				if(a10 == 6){
					sum = sum + c6;
				}
				if(a10 == 7){
					sum = sum + c7;
				}
				if(a10 == 8){
					sum = sum + c8;
				}
				if(a10 == 9){
					sum = sum + c9;
				}
				if(a10 == 10){
					sum = sum + c10;
				}
			}
			if(a12 == a11 + 1){
				if(a11 == 1){
					sum = sum + c1;
				}
				if(a11 == 2){
					sum = sum + c2;
				}
				if(a11 == 3){
					sum = sum + c3;
				}
				if(a11 == 4){
					sum = sum + c4;
				}
				if(a11 == 5){
					sum = sum + c5;
				}
				if(a11 == 6){
					sum = sum + c6;
				}
				if(a11 == 7){
					sum = sum + c7;
				}
				if(a11 == 8){
					sum = sum + c8;
				}
				if(a11 == 9){
					sum = sum + c9;
				}
				if(a11 == 10){
					sum = sum + c10;
				}
				if(a11 == 11){
					sum = sum + c11;
				}
			}
			if(a13 == a12 + 1){
				if(a12 == 1){
					sum = sum + c1;
				}
				if(a12 == 2){
					sum = sum + c2;
				}
				if(a12 == 3){
					sum = sum + c3;
				}
				if(a12 == 4){
					sum = sum + c4;
				}
				if(a12 == 5){
					sum = sum + c5;
				}
				if(a12 == 6){
					sum = sum + c6;
				}
				if(a12 == 7){
					sum = sum + c7;
				}
				if(a12 == 8){
					sum = sum + c8;
				}
				if(a12 == 9){
					sum = sum + c9;
				}
				if(a12 == 10){
					sum = sum + c10;
				}
				if(a12 == 11){
					sum = sum + c11;
				}
				if(a12 == 12){
					sum = sum + c12;
				}
			}
			if(a14 == a13 + 1){
				if(a13 == 1){
					sum = sum + c1;
				}
				if(a13 == 2){
					sum = sum + c2;
				}
				if(a13 == 3){
					sum = sum + c3;
				}
				if(a13 == 4){
					sum = sum + c4;
				}
				if(a13 == 5){
					sum = sum + c5;
				}
				if(a13 == 6){
					sum = sum + c6;
				}
				if(a13 == 7){
					sum = sum + c7;
				}
				if(a13 == 8){
					sum = sum + c8;
				}
				if(a13 == 9){
					sum = sum + c9;
				}
				if(a13 == 10){
					sum = sum + c10;
				}
				if(a13 == 11){
					sum = sum + c11;
				}
				if(a13 == 12){
					sum = sum + c12;
				}
				if(a13 == 13){
					sum = sum + c13;
				}
			}
			if(a15 == a14 + 1){
				if(a14 == 1){
					sum = sum + c1;
				}
				if(a14 == 2){
					sum = sum + c2;
				}
				if(a14 == 3){
					sum = sum + c3;
				}
				if(a14 == 4){
					sum = sum + c4;
				}
				if(a14 == 5){
					sum = sum + c5;
				}
				if(a14 == 6){
					sum = sum + c6;
				}
				if(a14 == 7){
					sum = sum + c7;
				}
				if(a14 == 8){
					sum = sum + c8;
				}
				if(a14 == 9){
					sum = sum + c9;
				}
				if(a14 == 10){
					sum = sum + c10;
				}
				if(a14 == 11){
					sum = sum + c11;
				}
				if(a14 == 12){
					sum = sum + c12;
				}
				if(a14 == 13){
					sum = sum + c13;
				}
				if(a14 == 14){
					sum = sum + c14;
				}
			}
			if(a16 == a15 + 1){
				if(a15 == 1){
					sum = sum + c1;
				}
				if(a15 == 2){
					sum = sum + c2;
				}
				if(a15 == 3){
					sum = sum + c3;
				}
				if(a15 == 4){
					sum = sum + c4;
				}
				if(a15 == 5){
					sum = sum + c5;
				}
				if(a15 == 6){
					sum = sum + c6;
				}
				if(a15 == 7){
					sum = sum + c7;
				}
				if(a15 == 8){
					sum = sum + c8;
				}
				if(a15 == 9){
					sum = sum + c9;
				}
				if(a15 == 10){
					sum = sum + c10;
				}
				if(a15 == 11){
					sum = sum + c11;
				}
				if(a15 == 12){
					sum = sum + c12;
				}
				if(a15 == 13){
					sum = sum + c13;
				}
				if(a15 == 14){
					sum = sum + c14;
				}
				if(a15 == 15){
					sum = sum + c15;
				}
			}
			if(a17 == a16 + 1){
				if(a16 == 1){
					sum = sum + c1;
				}
				if(a16 == 2){
					sum = sum + c2;
				}
				if(a16 == 3){
					sum = sum + c3;
				}
				if(a16 == 4){
					sum = sum + c4;
				}
				if(a16 == 5){
					sum = sum + c5;
				}
				if(a16 == 6){
					sum = sum + c6;
				}
				if(a16 == 7){
					sum = sum + c7;
				}
				if(a16 == 8){
					sum = sum + c8;
				}
				if(a16 == 9){
					sum = sum + c9;
				}
				if(a16 == 10){
					sum = sum + c10;
				}
				if(a16 == 11){
					sum = sum + c11;
				}
				if(a16 == 12){
					sum = sum + c12;
				}
				if(a16 == 13){
					sum = sum + c13;
				}
				if(a16 == 14){
					sum = sum + c14;
				}
				if(a16 == 15){
					sum = sum + c15;
				}
				if(a16 == 16){
					sum = sum + c16;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
			}
			if(a11 == a10 + 1){
				if(a10 == 1){
					sum = sum + c1;
				}
				if(a10 == 2){
					sum = sum + c2;
				}
				if(a10 == 3){
					sum = sum + c3;
				}
				if(a10 == 4){
					sum = sum + c4;
				}
				if(a10 == 5){
					sum = sum + c5;
				}
				if(a10 == 6){
					sum = sum + c6;
				}
				if(a10 == 7){
					sum = sum + c7;
				}
				if(a10 == 8){
					sum = sum + c8;
				}
				if(a10 == 9){
					sum = sum + c9;
				}
				if(a10 == 10){
					sum = sum + c10;
				}
			}
			if(a12 == a11 + 1){
				if(a11 == 1){
					sum = sum + c1;
				}
				if(a11 == 2){
					sum = sum + c2;
				}
				if(a11 == 3){
					sum = sum + c3;
				}
				if(a11 == 4){
					sum = sum + c4;
				}
				if(a11 == 5){
					sum = sum + c5;
				}
				if(a11 == 6){
					sum = sum + c6;
				}
				if(a11 == 7){
					sum = sum + c7;
				}
				if(a11 == 8){
					sum = sum + c8;
				}
				if(a11 == 9){
					sum = sum + c9;
				}
				if(a11 == 10){
					sum = sum + c10;
				}
				if(a11 == 11){
					sum = sum + c11;
				}
			}
			if(a13 == a12 + 1){
				if(a12 == 1){
					sum = sum + c1;
				}
				if(a12 == 2){
					sum = sum + c2;
				}
				if(a12 == 3){
					sum = sum + c3;
				}
				if(a12 == 4){
					sum = sum + c4;
				}
				if(a12 == 5){
					sum = sum + c5;
				}
				if(a12 == 6){
					sum = sum + c6;
				}
				if(a12 == 7){
					sum = sum + c7;
				}
				if(a12 == 8){
					sum = sum + c8;
				}
				if(a12 == 9){
					sum = sum + c9;
				}
				if(a12 == 10){
					sum = sum + c10;
				}
				if(a12 == 11){
					sum = sum + c11;
				}
				if(a12 == 12){
					sum = sum + c12;
				}
			}
			if(a14 == a13 + 1){
				if(a13 == 1){
					sum = sum + c1;
				}
				if(a13 == 2){
					sum = sum + c2;
				}
				if(a13 == 3){
					sum = sum + c3;
				}
				if(a13 == 4){
					sum = sum + c4;
				}
				if(a13 == 5){
					sum = sum + c5;
				}
				if(a13 == 6){
					sum = sum + c6;
				}
				if(a13 == 7){
					sum = sum + c7;
				}
				if(a13 == 8){
					sum = sum + c8;
				}
				if(a13 == 9){
					sum = sum + c9;
				}
				if(a13 == 10){
					sum = sum + c10;
				}
				if(a13 == 11){
					sum = sum + c11;
				}
				if(a13 == 12){
					sum = sum + c12;
				}
				if(a13 == 13){
					sum = sum + c13;
				}
			}
			if(a15 == a14 + 1){
				if(a14 == 1){
					sum = sum + c1;
				}
				if(a14 == 2){
					sum = sum + c2;
				}
				if(a14 == 3){
					sum = sum + c3;
				}
				if(a14 == 4){
					sum = sum + c4;
				}
				if(a14 == 5){
					sum = sum + c5;
				}
				if(a14 == 6){
					sum = sum + c6;
				}
				if(a14 == 7){
					sum = sum + c7;
				}
				if(a14 == 8){
					sum = sum + c8;
				}
				if(a14 == 9){
					sum = sum + c9;
				}
				if(a14 == 10){
					sum = sum + c10;
				}
				if(a14 == 11){
					sum = sum + c11;
				}
				if(a14 == 12){
					sum = sum + c12;
				}
				if(a14 == 13){
					sum = sum + c13;
				}
				if(a14 == 14){
					sum = sum + c14;
				}
			}
			if(a16 == a15 + 1){
				if(a15 == 1){
					sum = sum + c1;
				}
				if(a15 == 2){
					sum = sum + c2;
				}
				if(a15 == 3){
					sum = sum + c3;
				}
				if(a15 == 4){
					sum = sum + c4;
				}
				if(a15 == 5){
					sum = sum + c5;
				}
				if(a15 == 6){
					sum = sum + c6;
				}
				if(a15 == 7){
					sum = sum + c7;
				}
				if(a15 == 8){
					sum = sum + c8;
				}
				if(a15 == 9){
					sum = sum + c9;
				}
				if(a15 == 10){
					sum = sum + c10;
				}
				if(a15 == 11){
					sum = sum + c11;
				}
				if(a15 == 12){
					sum = sum + c12;
				}
				if(a15 == 13){
					sum = sum + c13;
				}
				if(a15 == 14){
					sum = sum + c14;
				}
				if(a15 == 15){
					sum = sum + c15;
				}
			}
			if(a17 == a16 + 1){
				if(a16 == 1){
					sum = sum + c1;
				}
				if(a16 == 2){
					sum = sum + c2;
				}
				if(a16 == 3){
					sum = sum + c3;
				}
				if(a16 == 4){
					sum = sum + c4;
				}
				if(a16 == 5){
					sum = sum + c5;
				}
				if(a16 == 6){
					sum = sum + c6;
				}
				if(a16 == 7){
					sum = sum + c7;
				}
				if(a16 == 8){
					sum = sum + c8;
				}
				if(a16 == 9){
					sum = sum + c9;
				}
				if(a16 == 10){
					sum = sum + c10;
				}
				if(a16 == 11){
					sum = sum + c11;
				}
				if(a16 == 12){
					sum = sum + c12;
				}
				if(a16 == 13){
					sum = sum + c13;
				}
				if(a16 == 14){
					sum = sum + c14;
				}
				if(a16 == 15){
					sum = sum + c15;
				}
				if(a16 == 16){
					sum = sum + c16;
				}
			}
			if(a18 == a17 + 1){
				if(a17 == 1){
					sum = sum + c1;
				}
				if(a17 == 2){
					sum = sum + c2;
				}
				if(a17 == 3){
					sum = sum + c3;
				}
				if(a17 == 4){
					sum = sum + c4;
				}
				if(a17 == 5){
					sum = sum + c5;
				}
				if(a17 == 6){
					sum = sum + c6;
				}
				if(a17 == 7){
					sum = sum + c7;
				}
				if(a17 == 8){
					sum = sum + c8;
				}
				if(a17 == 9){
					sum = sum + c9;
				}
				if(a17 == 10){
					sum = sum + c10;
				}
				if(a17 == 11){
					sum = sum + c11;
				}
				if(a17 == 12){
					sum = sum + c12;
				}
				if(a17 == 13){
					sum = sum + c13;
				}
				if(a17 == 14){
					sum = sum + c14;
				}
				if(a17 == 15){
					sum = sum + c15;
				}
				if(a17 == 16){
					sum = sum + c16;
				}
				if(a17 == 17){
					sum = sum + c17;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
			}
			if(a11 == a10 + 1){
				if(a10 == 1){
					sum = sum + c1;
				}
				if(a10 == 2){
					sum = sum + c2;
				}
				if(a10 == 3){
					sum = sum + c3;
				}
				if(a10 == 4){
					sum = sum + c4;
				}
				if(a10 == 5){
					sum = sum + c5;
				}
				if(a10 == 6){
					sum = sum + c6;
				}
				if(a10 == 7){
					sum = sum + c7;
				}
				if(a10 == 8){
					sum = sum + c8;
				}
				if(a10 == 9){
					sum = sum + c9;
				}
				if(a10 == 10){
					sum = sum + c10;
				}
			}
			if(a12 == a11 + 1){
				if(a11 == 1){
					sum = sum + c1;
				}
				if(a11 == 2){
					sum = sum + c2;
				}
				if(a11 == 3){
					sum = sum + c3;
				}
				if(a11 == 4){
					sum = sum + c4;
				}
				if(a11 == 5){
					sum = sum + c5;
				}
				if(a11 == 6){
					sum = sum + c6;
				}
				if(a11 == 7){
					sum = sum + c7;
				}
				if(a11 == 8){
					sum = sum + c8;
				}
				if(a11 == 9){
					sum = sum + c9;
				}
				if(a11 == 10){
					sum = sum + c10;
				}
				if(a11 == 11){
					sum = sum + c11;
				}
			}
			if(a13 == a12 + 1){
				if(a12 == 1){
					sum = sum + c1;
				}
				if(a12 == 2){
					sum = sum + c2;
				}
				if(a12 == 3){
					sum = sum + c3;
				}
				if(a12 == 4){
					sum = sum + c4;
				}
				if(a12 == 5){
					sum = sum + c5;
				}
				if(a12 == 6){
					sum = sum + c6;
				}
				if(a12 == 7){
					sum = sum + c7;
				}
				if(a12 == 8){
					sum = sum + c8;
				}
				if(a12 == 9){
					sum = sum + c9;
				}
				if(a12 == 10){
					sum = sum + c10;
				}
				if(a12 == 11){
					sum = sum + c11;
				}
				if(a12 == 12){
					sum = sum + c12;
				}
			}
			if(a14 == a13 + 1){
				if(a13 == 1){
					sum = sum + c1;
				}
				if(a13 == 2){
					sum = sum + c2;
				}
				if(a13 == 3){
					sum = sum + c3;
				}
				if(a13 == 4){
					sum = sum + c4;
				}
				if(a13 == 5){
					sum = sum + c5;
				}
				if(a13 == 6){
					sum = sum + c6;
				}
				if(a13 == 7){
					sum = sum + c7;
				}
				if(a13 == 8){
					sum = sum + c8;
				}
				if(a13 == 9){
					sum = sum + c9;
				}
				if(a13 == 10){
					sum = sum + c10;
				}
				if(a13 == 11){
					sum = sum + c11;
				}
				if(a13 == 12){
					sum = sum + c12;
				}
				if(a13 == 13){
					sum = sum + c13;
				}
			}
			if(a15 == a14 + 1){
				if(a14 == 1){
					sum = sum + c1;
				}
				if(a14 == 2){
					sum = sum + c2;
				}
				if(a14 == 3){
					sum = sum + c3;
				}
				if(a14 == 4){
					sum = sum + c4;
				}
				if(a14 == 5){
					sum = sum + c5;
				}
				if(a14 == 6){
					sum = sum + c6;
				}
				if(a14 == 7){
					sum = sum + c7;
				}
				if(a14 == 8){
					sum = sum + c8;
				}
				if(a14 == 9){
					sum = sum + c9;
				}
				if(a14 == 10){
					sum = sum + c10;
				}
				if(a14 == 11){
					sum = sum + c11;
				}
				if(a14 == 12){
					sum = sum + c12;
				}
				if(a14 == 13){
					sum = sum + c13;
				}
				if(a14 == 14){
					sum = sum + c14;
				}
			}
			if(a16 == a15 + 1){
				if(a15 == 1){
					sum = sum + c1;
				}
				if(a15 == 2){
					sum = sum + c2;
				}
				if(a15 == 3){
					sum = sum + c3;
				}
				if(a15 == 4){
					sum = sum + c4;
				}
				if(a15 == 5){
					sum = sum + c5;
				}
				if(a15 == 6){
					sum = sum + c6;
				}
				if(a15 == 7){
					sum = sum + c7;
				}
				if(a15 == 8){
					sum = sum + c8;
				}
				if(a15 == 9){
					sum = sum + c9;
				}
				if(a15 == 10){
					sum = sum + c10;
				}
				if(a15 == 11){
					sum = sum + c11;
				}
				if(a15 == 12){
					sum = sum + c12;
				}
				if(a15 == 13){
					sum = sum + c13;
				}
				if(a15 == 14){
					sum = sum + c14;
				}
				if(a15 == 15){
					sum = sum + c15;
				}
			}
			if(a17 == a16 + 1){
				if(a16 == 1){
					sum = sum + c1;
				}
				if(a16 == 2){
					sum = sum + c2;
				}
				if(a16 == 3){
					sum = sum + c3;
				}
				if(a16 == 4){
					sum = sum + c4;
				}
				if(a16 == 5){
					sum = sum + c5;
				}
				if(a16 == 6){
					sum = sum + c6;
				}
				if(a16 == 7){
					sum = sum + c7;
				}
				if(a16 == 8){
					sum = sum + c8;
				}
				if(a16 == 9){
					sum = sum + c9;
				}
				if(a16 == 10){
					sum = sum + c10;
				}
				if(a16 == 11){
					sum = sum + c11;
				}
				if(a16 == 12){
					sum = sum + c12;
				}
				if(a16 == 13){
					sum = sum + c13;
				}
				if(a16 == 14){
					sum = sum + c14;
				}
				if(a16 == 15){
					sum = sum + c15;
				}
				if(a16 == 16){
					sum = sum + c16;
				}
			}
			if(a18 == a17 + 1){
				if(a17 == 1){
					sum = sum + c1;
				}
				if(a17 == 2){
					sum = sum + c2;
				}
				if(a17 == 3){
					sum = sum + c3;
				}
				if(a17 == 4){
					sum = sum + c4;
				}
				if(a17 == 5){
					sum = sum + c5;
				}
				if(a17 == 6){
					sum = sum + c6;
				}
				if(a17 == 7){
					sum = sum + c7;
				}
				if(a17 == 8){
					sum = sum + c8;
				}
				if(a17 == 9){
					sum = sum + c9;
				}
				if(a17 == 10){
					sum = sum + c10;
				}
				if(a17 == 11){
					sum = sum + c11;
				}
				if(a17 == 12){
					sum = sum + c12;
				}
				if(a17 == 13){
					sum = sum + c13;
				}
				if(a17 == 14){
					sum = sum + c14;
				}
				if(a17 == 15){
					sum = sum + c15;
				}
				if(a17 == 16){
					sum = sum + c16;
				}
				if(a17 == 17){
					sum = sum + c17;
				}
			}
			if(a19 == a18 + 1){
				if(a18 == 1){
					sum = sum + c1;
				}
				if(a18 == 2){
					sum = sum + c2;
				}
				if(a18 == 3){
					sum = sum + c3;
				}
				if(a18 == 4){
					sum = sum + c4;
				}
				if(a18 == 5){
					sum = sum + c5;
				}
				if(a18 == 6){
					sum = sum + c6;
				}
				if(a18 == 7){
					sum = sum + c7;
				}
				if(a18 == 8){
					sum = sum + c8;
				}
				if(a18 == 9){
					sum = sum + c9;
				}
				if(a18 == 10){
					sum = sum + c10;
				}
				if(a18 == 11){
					sum = sum + c11;
				}
				if(a18 == 12){
					sum = sum + c12;
				}
				if(a18 == 13){
					sum = sum + c13;
				}
				if(a18 == 14){
					sum = sum + c14;
				}
				if(a18 == 15){
					sum = sum + c15;
				}
				if(a18 == 16){
					sum = sum + c16;
				}
				if(a18 == 17){
					sum = sum + c17;
				}
				if(a18 == 18){
					sum = sum + c18;
				}
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
				if(a1 == 1){
					sum = sum + c1;
				}
				if(a1 == 2){
					sum = sum + c2;
				}
			}
			if(a3 == a2 + 1){
				if(a2 == 1){
					sum = sum + c1;
				}
				if(a2 == 2){
					sum = sum + c2;
				}
			}
			if(a4 == a3 + 1){
				if(a3 == 1){
					sum = sum + c1;
				}
				if(a3 == 2){
					sum = sum + c2;
				}
				if(a3 == 3){
					sum = sum + c3;
				}
			}
			if(a5 == a4 + 1){
				if(a4 == 1){
					sum = sum + c1;
				}
				if(a4 == 2){
					sum = sum + c2;
				}
				if(a4 == 3){
					sum = sum + c3;
				}
				if(a4 == 4){
					sum = sum + c4;
				}
			}
			if(a6 == a5 + 1){
				if(a5 == 1){
					sum = sum + c1;
				}
				if(a5 == 2){
					sum = sum + c2;
				}
				if(a5 == 3){
					sum = sum + c3;
				}
				if(a5 == 4){
					sum = sum + c4;
				}
				if(a5 == 5){
					sum = sum + c5;
				}
			}
			if(a7 == a6 + 1){
				if(a6 == 1){
					sum = sum + c1;
				}
				if(a6 == 2){
					sum = sum + c2;
				}
				if(a6 == 3){
					sum = sum + c3;
				}
				if(a6 == 4){
					sum = sum + c4;
				}
				if(a6 == 5){
					sum = sum + c5;
				}
				if(a6 == 6){
					sum = sum + c6;
				}
			}
			if(a8 == a7 + 1){
				if(a7 == 1){
					sum = sum + c1;
				}
				if(a7 == 2){
					sum = sum + c2;
				}
				if(a7 == 3){
					sum = sum + c3;
				}
				if(a7 == 4){
					sum = sum + c4;
				}
				if(a7 == 5){
					sum = sum + c5;
				}
				if(a7 == 6){
					sum = sum + c6;
				}
				if(a7 == 7){
					sum = sum + c7;
				}
			}
			if(a9 == a8 + 1){
				if(a8 == 1){
					sum = sum + c1;
				}
				if(a8 == 2){
					sum = sum + c2;
				}
				if(a8 == 3){
					sum = sum + c3;
				}
				if(a8 == 4){
					sum = sum + c4;
				}
				if(a8 == 5){
					sum = sum + c5;
				}
				if(a8 == 6){
					sum = sum + c6;
				}
				if(a8 == 7){
					sum = sum + c7;
				}
				if(a8 == 8){
					sum = sum + c8;
				}
			}
			if(a10 == a9 + 1){
				if(a9 == 1){
					sum = sum + c1;
				}
				if(a9 == 2){
					sum = sum + c2;
				}
				if(a9 == 3){
					sum = sum + c3;
				}
				if(a9 == 4){
					sum = sum + c4;
				}
				if(a9 == 5){
					sum = sum + c5;
				}
				if(a9 == 6){
					sum = sum + c6;
				}
				if(a9 == 7){
					sum = sum + c7;
				}
				if(a9 == 8){
					sum = sum + c8;
				}
				if(a9 == 9){
					sum = sum + c9;
				}
			}
			if(a11 == a10 + 1){
				if(a10 == 1){
					sum = sum + c1;
				}
				if(a10 == 2){
					sum = sum + c2;
				}
				if(a10 == 3){
					sum = sum + c3;
				}
				if(a10 == 4){
					sum = sum + c4;
				}
				if(a10 == 5){
					sum = sum + c5;
				}
				if(a10 == 6){
					sum = sum + c6;
				}
				if(a10 == 7){
					sum = sum + c7;
				}
				if(a10 == 8){
					sum = sum + c8;
				}
				if(a10 == 9){
					sum = sum + c9;
				}
				if(a10 == 10){
					sum = sum + c10;
				}
			}
			if(a12 == a11 + 1){
				if(a11 == 1){
					sum = sum + c1;
				}
				if(a11 == 2){
					sum = sum + c2;
				}
				if(a11 == 3){
					sum = sum + c3;
				}
				if(a11 == 4){
					sum = sum + c4;
				}
				if(a11 == 5){
					sum = sum + c5;
				}
				if(a11 == 6){
					sum = sum + c6;
				}
				if(a11 == 7){
					sum = sum + c7;
				}
				if(a11 == 8){
					sum = sum + c8;
				}
				if(a11 == 9){
					sum = sum + c9;
				}
				if(a11 == 10){
					sum = sum + c10;
				}
				if(a11 == 11){
					sum = sum + c11;
				}
			}
			if(a13 == a12 + 1){
				if(a12 == 1){
					sum = sum + c1;
				}
				if(a12 == 2){
					sum = sum + c2;
				}
				if(a12 == 3){
					sum = sum + c3;
				}
				if(a12 == 4){
					sum = sum + c4;
				}
				if(a12 == 5){
					sum = sum + c5;
				}
				if(a12 == 6){
					sum = sum + c6;
				}
				if(a12 == 7){
					sum = sum + c7;
				}
				if(a12 == 8){
					sum = sum + c8;
				}
				if(a12 == 9){
					sum = sum + c9;
				}
				if(a12 == 10){
					sum = sum + c10;
				}
				if(a12 == 11){
					sum = sum + c11;
				}
				if(a12 == 12){
					sum = sum + c12;
				}
			}
			if(a14 == a13 + 1){
				if(a13 == 1){
					sum = sum + c1;
				}
				if(a13 == 2){
					sum = sum + c2;
				}
				if(a13 == 3){
					sum = sum + c3;
				}
				if(a13 == 4){
					sum = sum + c4;
				}
				if(a13 == 5){
					sum = sum + c5;
				}
				if(a13 == 6){
					sum = sum + c6;
				}
				if(a13 == 7){
					sum = sum + c7;
				}
				if(a13 == 8){
					sum = sum + c8;
				}
				if(a13 == 9){
					sum = sum + c9;
				}
				if(a13 == 10){
					sum = sum + c10;
				}
				if(a13 == 11){
					sum = sum + c11;
				}
				if(a13 == 12){
					sum = sum + c12;
				}
				if(a13 == 13){
					sum = sum + c13;
				}
			}
			if(a15 == a14 + 1){
				if(a14 == 1){
					sum = sum + c1;
				}
				if(a14 == 2){
					sum = sum + c2;
				}
				if(a14 == 3){
					sum = sum + c3;
				}
				if(a14 == 4){
					sum = sum + c4;
				}
				if(a14 == 5){
					sum = sum + c5;
				}
				if(a14 == 6){
					sum = sum + c6;
				}
				if(a14 == 7){
					sum = sum + c7;
				}
				if(a14 == 8){
					sum = sum + c8;
				}
				if(a14 == 9){
					sum = sum + c9;
				}
				if(a14 == 10){
					sum = sum + c10;
				}
				if(a14 == 11){
					sum = sum + c11;
				}
				if(a14 == 12){
					sum = sum + c12;
				}
				if(a14 == 13){
					sum = sum + c13;
				}
				if(a14 == 14){
					sum = sum + c14;
				}
			}
			if(a16 == a15 + 1){
				if(a15 == 1){
					sum = sum + c1;
				}
				if(a15 == 2){
					sum = sum + c2;
				}
				if(a15 == 3){
					sum = sum + c3;
				}
				if(a15 == 4){
					sum = sum + c4;
				}
				if(a15 == 5){
					sum = sum + c5;
				}
				if(a15 == 6){
					sum = sum + c6;
				}
				if(a15 == 7){
					sum = sum + c7;
				}
				if(a15 == 8){
					sum = sum + c8;
				}
				if(a15 == 9){
					sum = sum + c9;
				}
				if(a15 == 10){
					sum = sum + c10;
				}
				if(a15 == 11){
					sum = sum + c11;
				}
				if(a15 == 12){
					sum = sum + c12;
				}
				if(a15 == 13){
					sum = sum + c13;
				}
				if(a15 == 14){
					sum = sum + c14;
				}
				if(a15 == 15){
					sum = sum + c15;
				}
			}
			if(a17 == a16 + 1){
				if(a16 == 1){
					sum = sum + c1;
				}
				if(a16 == 2){
					sum = sum + c2;
				}
				if(a16 == 3){
					sum = sum + c3;
				}
				if(a16 == 4){
					sum = sum + c4;
				}
				if(a16 == 5){
					sum = sum + c5;
				}
				if(a16 == 6){
					sum = sum + c6;
				}
				if(a16 == 7){
					sum = sum + c7;
				}
				if(a16 == 8){
					sum = sum + c8;
				}
				if(a16 == 9){
					sum = sum + c9;
				}
				if(a16 == 10){
					sum = sum + c10;
				}
				if(a16 == 11){
					sum = sum + c11;
				}
				if(a16 == 12){
					sum = sum + c12;
				}
				if(a16 == 13){
					sum = sum + c13;
				}
				if(a16 == 14){
					sum = sum + c14;
				}
				if(a16 == 15){
					sum = sum + c15;
				}
				if(a16 == 16){
					sum = sum + c16;
				}
			}
			if(a18 == a17 + 1){
				if(a17 == 1){
					sum = sum + c1;
				}
				if(a17 == 2){
					sum = sum + c2;
				}
				if(a17 == 3){
					sum = sum + c3;
				}
				if(a17 == 4){
					sum = sum + c4;
				}
				if(a17 == 5){
					sum = sum + c5;
				}
				if(a17 == 6){
					sum = sum + c6;
				}
				if(a17 == 7){
					sum = sum + c7;
				}
				if(a17 == 8){
					sum = sum + c8;
				}
				if(a17 == 9){
					sum = sum + c9;
				}
				if(a17 == 10){
					sum = sum + c10;
				}
				if(a17 == 11){
					sum = sum + c11;
				}
				if(a17 == 12){
					sum = sum + c12;
				}
				if(a17 == 13){
					sum = sum + c13;
				}
				if(a17 == 14){
					sum = sum + c14;
				}
				if(a17 == 15){
					sum = sum + c15;
				}
				if(a17 == 16){
					sum = sum + c16;
				}
				if(a17 == 17){
					sum = sum + c17;
				}
			}
			if(a19 == a18 + 1){
				if(a18 == 1){
					sum = sum + c1;
				}
				if(a18 == 2){
					sum = sum + c2;
				}
				if(a18 == 3){
					sum = sum + c3;
				}
				if(a18 == 4){
					sum = sum + c4;
				}
				if(a18 == 5){
					sum = sum + c5;
				}
				if(a18 == 6){
					sum = sum + c6;
				}
				if(a18 == 7){
					sum = sum + c7;
				}
				if(a18 == 8){
					sum = sum + c8;
				}
				if(a18 == 9){
					sum = sum + c9;
				}
				if(a18 == 10){
					sum = sum + c10;
				}
				if(a18 == 11){
					sum = sum + c11;
				}
				if(a18 == 12){
					sum = sum + c12;
				}
				if(a18 == 13){
					sum = sum + c13;
				}
				if(a18 == 14){
					sum = sum + c14;
				}
				if(a18 == 15){
					sum = sum + c15;
				}
				if(a18 == 16){
					sum = sum + c16;
				}
				if(a18 == 17){
					sum = sum + c17;
				}
				if(a18 == 18){
					sum = sum + c18;
				}
			}
			if(a20 == a19 + 1){
				if(a19 == 1){
					sum = sum + c1;
				}
				if(a19 == 2){
					sum = sum + c2;
				}
				if(a19 == 3){
					sum = sum + c3;
				}
				if(a19 == 4){
					sum = sum + c4;
				}
				if(a19 == 5){
					sum = sum + c5;
				}
				if(a19 == 6){
					sum = sum + c6;
				}
				if(a19 == 7){
					sum = sum + c7;
				}
				if(a19 == 8){
					sum = sum + c8;
				}
				if(a19 == 9){
					sum = sum + c9;
				}
				if(a19 == 10){
					sum = sum + c10;
				}
				if(a19 == 11){
					sum = sum + c11;
				}
				if(a19 == 12){
					sum = sum + c12;
				}
				if(a19 == 13){
					sum = sum + c13;
				}
				if(a19 == 14){
					sum = sum + c14;
				}
				if(a19 == 15){
					sum = sum + c15;
				}
				if(a19 == 16){
					sum = sum + c16;
				}
				if(a19 == 17){
					sum = sum + c17;
				}
				if(a19 == 18){
					sum = sum + c18;
				}
				if(a19 == 19){
					sum = sum + c19;
				}
			}
		}
		
		System.out.println(sum);
		
	}
}