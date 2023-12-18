import java.util.Scanner;

public class Main {
	
	public static void main( String[]args ){
		
		Scanner sc = new Scanner( System.in );
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		 
		int p_number = 0;//ロープのほどく可能ナンバー
		int b = 0;//一個前のロープの長さ
		boolean l_flag = false; // ここがfalseだったらほどけないということ
		for( int i = 0;i < n;i++ ){
			
			int a = sc.nextInt();
			if( i == 0 && !l_flag ){
				if( a == l ){
					l_flag = true;
					p_number = i;
					break;
				}
			}else if( !l_flag ){
				
				if( l > a + b )
					l_flag = false;
				else{
					l_flag = true;
					p_number = i;
					break;
				}
			}
			b = a;
		}
		
		if( l_flag ){
			System.out.println("Possible");
			
				for( int i = n - 1;i > p_number;i-- )
					System.out.println(i);
				for( int i = 1;i <= p_number;i++ )
					System.out.println(i);
		
		}else{
			System.out.println("Impossible");
		}
		
	}

}