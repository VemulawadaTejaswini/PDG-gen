//package algorthims.LeetCode;

import java.util.*;


public class GoldenCoins{
    
    public static int points( int num ){
	
	int points = 0;
	
	while( num > 0 ){
	    if( num - 500 >= 0){
		points += 1000;
		num -= 500;
	    }else if( num - 5 >= 0 ){
		points += 5;
		num -= 5;
	    }
	}
	
	return points;
	
    }
    public static void main(String[] args) {
	
	Scanner sc = new Scanner( System.in );
	System.out.print( points( sc.nextInt() ));
    }
}
