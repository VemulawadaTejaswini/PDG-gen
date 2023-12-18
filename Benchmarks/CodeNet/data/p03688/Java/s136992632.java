import java.util.*;
import java.io.*;

public class Main {
	public static int max(int[] array){
		int L = array.length;
		int m = array[0];
		for(int i=1;i<L;i++){
			if(array[i]>m) m=array[i];
		}
		return m;
	}
	public static int min(int[] array){
		int L = array.length;
		int m = array[0];
		for(int i=1;i<L;i++){
			if(array[i]<m) m=array[i];
		}
		return m;
	}
	public static int count(int[] array, int target){
		int c = 0;
		int L = array.length;
		for(int i=0;i<L;i++){
			if(array[i]==target)c++;
		}
		return c;
	}
	
	public static boolean solve(int[] hat){
		int M = max(hat);
		int m= min(hat);
		if(M-m>=2) return false;
		
		if(m==M){
			return (m==1 || hat.length==hat[0]+1 || hat.length/2>=m);
		}
		
		//if M==m+1
		//there are M colors
		//the cats who say "I see only m colors" are alone, and the others are not
		int possibleMin = count(hat,m);
		if(count(hat,M)>0)possibleMin++;
		
		int possibleMax = count(hat,m)+count(hat,M)/2;
		

		return (possibleMin<=M && possibleMax>=M);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] hat = new int[N];
        for(int n=0;n<N;n++)hat[n]=sc.nextInt();
        
        if(solve(hat))System.out.println("Yes");
        else System.out.println("No");
    }
}