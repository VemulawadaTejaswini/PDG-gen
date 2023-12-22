import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(true){
    		int n = input.nextInt();
    		int s = input.nextInt();
    		if(n == 0 && s == 0)break;
    		System.out.println(count(n,s,0,0));
    	}
    }
    
    public static int count(int n,int s,int sum,int stnum){
    	if(n == 0 && sum == s)return 1;
    	if(stnum == 10 || sum > s || n == 0)return 0;
    	return count(n-1,s,sum+stnum,stnum+1)+count(n,s,sum,stnum+1);
    }
}