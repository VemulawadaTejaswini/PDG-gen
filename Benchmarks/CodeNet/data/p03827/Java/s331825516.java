import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int n = scan.nextInt();
	String s = scan.next();

	int ans = 0;
	int max = 0;
	for(int i = 0; i < n; i++){
	    if(s.charAt(i) == 'I'){
		ans++;
	    }else{
		ans--;
	    }
	    if(max < ans){
		max = ans;
	    }
	}

	System.out.println(max);
    }
}
