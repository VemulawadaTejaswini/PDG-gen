import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int Y = scan.nextInt();

	int fukuzawa = -1;
	int higuchi = -1;
	int noguchi = -1;
	int flag = 0;
	loop: for(int i = 0; i <= N; i++){
	    for(int j = 0; j <= N-i; j++){
		int k = N-i-j;
		int money = 10000*i+5000*j+1000*k;
		if(money == Y){
		    fukuzawa = i;
		    higuchi = j;
		    noguchi = k;
		    break loop;
		}
	    }
	}
	
	
	System.out.println(fukuzawa+" "+higuchi+" "+noguchi);
    }
}
