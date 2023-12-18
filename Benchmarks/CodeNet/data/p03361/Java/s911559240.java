import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void printlnYN(boolean b){
		if(b) System.out.println("Yes");
		else System.out.println("No");
	}

	public static void main(String[] args) throws IOException {
		
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	String[][] c = new String[h][w];
    	for(int i = 0; i < h; i++){
    		String s = sc.next();
    		
    		for(int j = 0; j < w; j++){
    			c[i][j] = String.valueOf(s.charAt(j));
    		}
    		
    	}
    	
    	boolean flag = true;
    	
    	for(int i = 0; i < h; i++){
    		for(int j = 0; j < w; j++){
    			if(c[i][j].equals("#")){
    				boolean f = false;
    				if(i != 0 && c[i-1][j].equals("#")) f = true;
    				if(i != h-1 && c[i+1][j].equals("#")) f = true;
    				if(j != 0 && c[i][j-1].equals("#")) f = true;
    				if(j != w-1 && c[i][j+1].equals("#")) f = true;
    				
    				if(!f){
    					flag = false;
    					break;
    				}
    			}
    			if(!flag) break;
    		}
    	}
    	
    	printlnYN(flag);
	}

}
