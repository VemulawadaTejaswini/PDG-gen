import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans =0;
        for(int i =1; i<=9; i++) {
        	for(int j =1; j<=9; j++) {
        		if(i*j==N) {
        			ans+=1;
        		}else {
        			ans+=0;
        		}
        	}
        }
        if(ans>0) {
        System.out.println("Yes");
        }else {
        System.out.println("No");
        }
	}
}