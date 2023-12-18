import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

	    char[] S = sc.next().toCharArray();
	    int ans = 0;
	    char[] N = {'C','O','D','E','F','E','S','T','I','V','A','L','2','0','1','6'};

	    for(int i = 0;i<16;i++){
	    	if(S[i]!=N[i]){
	    		ans++;
	    	}
	    }
	    System.out.println(ans);
	}
}