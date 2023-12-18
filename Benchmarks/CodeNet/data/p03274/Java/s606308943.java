import java.util.Scanner;

public class Main{
	 static int N,M;
	 static int []candle;
	 static int minLength;
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        candle = new int[N];
        int position = -10000;
        int flagLength = 10000;
        boolean positionFlag = true;
        for(int i=0;i<N;i++) {
        	candle[i] = sc.nextInt();
        	if(candle[i]>=0 && positionFlag) {
        		position = i;
        		positionFlag = false;
        	}
        }
        
        if(position == -10000) {
        	minLength = distanceV(candle[candle.length-M],0);
        }else if(position==0) {
        	minLength = distanceV(0,candle[M-1]);
        }else if(position>0 && position<M) {
        	int low = 0;
        	int high = 0;
        	int minLengthTemp = 0;
        	
        	if(candle.length-position>=M) {
        		for(int i=0;i<=position;i++) {
        			low = candle[i];
        			high = candle[i+M-1];
        			minLengthTemp = lengthCandle(low,high);
        			if(minLengthTemp<flagLength) {
        				flagLength = minLengthTemp;
        			}
        		}
        	}else if(candle.length-position<M) {
        		for(int i=0;i<=candle.length-M;i++) {
        			low = candle[i];
        			high = candle[i+M-1];
        			minLengthTemp = lengthCandle(low,high);
        			if(minLengthTemp<flagLength) {
        				flagLength = minLengthTemp;
        			}
        		}
        	}
        	
        	
        	minLength = flagLength;
        }else if(position>=M && (candle.length-position)<M) {
        	int low = 0;
        	int high = 0;
        	int minLengthTemp = 0;
        	for(int i=candle.length;i>=position;i--) {
        		low = candle[i-M];
        		high = candle[i-1];
        		minLengthTemp = lengthCandle(low,high);
        		if(minLengthTemp<flagLength) {
        			flagLength = minLengthTemp;
        		}
			}
        	minLength = flagLength;
        }if(position>=M && (candle.length-position)>=M) {
        	int low = 0;
        	int high = 0;
        	int minLengthTemp = 0;
        	for(int i=M;i>=0;i--) {
        		low = candle[position-i];
        		high = candle[position-i+M-1];
        		minLengthTemp = lengthCandle(low,high);
        		if(minLengthTemp<flagLength) {
        			flagLength = minLengthTemp;
        		}
			}
        	minLength = flagLength;
        }
        
        System.out.println(minLength);
        sc.close();
	 }
	 
	 private static int distanceV(int a,int b) {
        int dis = Math.abs(a-b);
        return dis;
	 }
	 
	 private static int lengthCandle (int minCandle,int maxCandle) {
	        int length = 0;
	        if(minCandle>=0 && maxCandle>=0) {
	            length = distanceV(0,maxCandle);
	        }else if(minCandle<0 && maxCandle>=0){
	            int minCandleDistance = distanceV(0,minCandle);
	            int maxCandleDistance = distanceV(0,maxCandle);
	            if(minCandleDistance <= maxCandleDistance) {
	                length = 2*minCandleDistance+maxCandleDistance;
	            }else {
	                length = minCandleDistance+maxCandleDistance*2;
	            }
	        }else {
	            length = distanceV(minCandle,0);
	        }
	        return length;
	    }
}


