import java.util.Scanner;

public class Main {

	public static void main ( String[] args ){
		Scanner sc = new Scanner( System.in );
		while( true ){
			String src = sc.next();
			char[] strc = src.toCharArray();
			String type = sc.next();
			char diff =  'a' - 'A';
			switch (type.toCharArray()[ 0 ] ){
			case 'X':
				return;
			case 'U':
				if( 'a' <= strc[ 0 ] && strc[ 0 ] <= 'z' ){
					strc[ 0 ] -= diff; // to upper case
				}
				for( int i = 1; i < strc.length; i++ ){
					if( strc[ i ] == '_' ){
						String s1 = "";
						String s2 = "";
						for( int j = 0; j < i; j++ ){
							s1 += strc[ j ];
						}
						if( 'a' <= strc[ i + 1 ] && strc[ i + 1 ] <= 'z' ){
							strc[ i + 1 ] -= diff;
						}
						for( int j = i + 1; j < strc.length; j++ ){
							s2 += strc[ j ];
						}
						strc = ( s1 + s2 ).toCharArray();
					}
				}
				System.out.println( strc );
				break;
			case 'L':
				if( 'A' <= strc[ 0 ] && strc[ 0 ] <= 'Z' ){
					strc[ 0 ] += diff; // to upper case
				}
				for( int i = 1; i < strc.length; i++ ){
					if( strc[ i ] == '_' ){
						String s1 = "";
						String s2 = "";
						for( int j = 0; j < i; j++ ){
							s1 += strc[ j ];
						}
						if( 'a' <= strc[ i + 1 ] && strc[ i + 1 ] <= 'z' ){
							strc[ i + 1 ] -= diff;
						}
						for( int j = i + 1; j < strc.length; j++ ){
							s2 += strc[ j ];
						}
						strc = ( s1 + s2 ).toCharArray();
					}
				}
				System.out.println( strc );
				break;
			case 'D':
				if( 'A' <= strc[ 0 ] && strc[ 0 ] <= 'Z' ){
					strc[ 0 ] += diff; // to upper case
				}
				for( int i = 1; i < strc.length; i++ ){
					if( 'A' <= strc[ i ] && strc[ i ] <= 'Z' ){
						String s = "";
						for( int j = 0; j < i; j++ ){
							s += strc[ j ];
						}
						s += "_";
						strc[ i ] += diff;
						for( int j = i; j < strc.length; j++ ){
							s += strc[ j ];
						}
						strc = s.toCharArray();
					}
				}
				System.out.println( strc );
				break;
			}

		}
	}
}