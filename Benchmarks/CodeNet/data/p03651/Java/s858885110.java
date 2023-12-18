import java.util.Scanner;

public class Main {

    public static void main(String args[]){

    	//A問題
    	Scanner scan = new Scanner(System.in);

    	int n;
    	int k;
    	int abs;
    	int n2;

    	// 可能ならば1
    	int possible = 0;

    	n = Integer.parseInt(scan.next());
    	k = Integer.parseInt(scan.next());
    	//ボールの番号の配列
    	int ball[] = new int[100000];

    	for(int c=0; c < n ; c++ ){
    		ball[c] = Integer.parseInt(scan.next());
    	}


    	for(int c=0; c < n ; c++ ){
    		if(ball[c] == k){
    			possible++;
    		}
    	}
    	if(possible == 0){
    		System.out.println("IMPOSSIBLE");
    	}
    	else{
    		System.out.println("POSSIBLE");
    	}
    }
}