import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        
        long count = 0;		//条件を満たす組はいくつあるか

		for(int i=1; i<(n-1); i++){
			char si = s.charAt(i-1);
		for(int j=i+1; j<n; j++){
			char sj = s.charAt(j-1);
		if(si!=sj){
			for(int k=j+1; k<(n+1); k++){
				char sk = s.charAt(k-1);
				//文字列のijk文字目がすべて異なる文字ならば…
				if((si!=sk)&&(sj!=sk)){
					if((j-i)!=(k-j)){
						count++;
				} 
			}
		}}}}

		System.out.println(count);
	    scan.close();	
    }
}