import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
        	int n = cin.nextInt();
        	int[] blocks = readArray(cin,2*n-1);
            System.out.println(getSub(blocks));
        }
    }
    public static int getSub(int[] blocks){
    	int n = blocks.length;
    	if(n==1) return blocks[0];
    	if(blocks[n/2-1]==blocks[n/2]||blocks[n/2]==blocks[n/2+1]) return getMid(blocks,n/2);
    	int[] blocks1 = new int[n-2];
    	for(int p=0;p<blocks.length-2;p++){
    		blocks1[p] = getMid(blocks,p);
    	}
    	return getSub(blocks1);
    }
    public static int getMid(int[] blocks,int p){
    	
    	int max = blocks[p]>blocks[p+1]?blocks[p]:blocks[p+1];
    	int min = blocks[p]<blocks[p+1]?blocks[p]:blocks[p+1];
    	max = max>blocks[p+2]?max:blocks[p+2];
    	min = min<blocks[p+2]?min:blocks[p+2];
    	return blocks[p]+blocks[p+1]+blocks[p+2]-max-min;
    	
    }
    public static int[] readArray(Scanner in,int n){
    	int[] array = new int[n];
    	for(int j=0;j<n;j++){
    		array[j] = in.nextInt();
    	}
    	return array;
    }
    
}