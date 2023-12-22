import java.util.Scanner;

public class Main {
	
	static int n;
	static int p;
	static int kouho[];
	static int stone;
	
	static int senkyo(int i){
	    while(!(kouho[i%n] == p-1)){
	         if(stone == 0){
	            stone += kouho[i%n];
	            kouho[i%n] = 0;
	        }else{
	            stone--;
	            kouho[i%n]++;
	        }
	        return senkyo(i+1);
	    }
	    return i%n-1;
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while(true){
	        n = sc.nextInt();
	        p = sc.nextInt();
	        if(n==0 && p==0) break;
	        kouho = new int[n];
	        for(int i=0;i<n;i++){
	            kouho[i] = 0;
	        }
	        stone = p;
	        System.out.println(senkyo(1));
	    }
	}
}

