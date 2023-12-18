import System;

public class Main {

	public static void main( string[] args ){
		int n = Integer.parse( args[0] );
		int k = Integer.parse( args[1] );
		String s = args[2];
		String[] splited = s.split("");
		String ans = "";
		for( int i = 0 ; i < splited.length ; i++ ){
			if( i == k ){
				ans += splited[i].toLowerCase( splited[i] );
			}
			else {
				ans += splited[i];
			}
		}
		System.out.println(ans);
	}
}