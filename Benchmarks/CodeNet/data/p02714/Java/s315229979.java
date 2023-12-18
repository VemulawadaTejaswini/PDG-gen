import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String S = sc.next();
	
	int[] rgb = new int[3];
	for(int i=0;i<N;i++){
	    if(S.charAt(i) == 'R') rgb[0]++;
	    else if(S.charAt(i) == 'G') rgb[1]++;
	    else rgb[2]++;
	}
	int count = rgb[0]*rgb[1]*rgb[2];
	
	for(int i=0;i<N-2;i++){
	    for(int j=i+1;j<N-1;j++){
		for(int k=j+1;k<N;k++){
		    if(j-i == k-j){
			if(S.charAt(i)!=S.charAt(j) && S.charAt(i)!=S.charAt(k)  && S.charAt(j)!=S.charAt(k)){
			    count--;
			}
		    }
		}
	    }
	}
	System.out.print(count);
    }
}
