import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        boolean isExistSharp = false;
        
        String result;
        boolean[] isShowable = new boolean[W];
        boolean[] isLnable = new boolean[H];
        char[][] arr = new char[H][W];
        
        
      
        for(int i = 0; i<H; i++) {
        	isExistSharp = false;
        	String a_i = sc.next();
        		
        	if(!a_i.matches("^\\.+$")) {
        		isLnable[i] = true;
        		for(int j = 0; j<W; j++) {
        			arr[i][j] = a_i.charAt(j);
        		}
        	}
        }
        
        for(int j = 0; j<W; j++) {
        	result = "";
        	isShowable[j] = false;
        	for(int i = 0; i<H; i++) {
        	
        		if(arr[i][j] == '#') {
        			isShowable[j] = true;
        		} 
        	}
        }
        
        for(int i = 0; i<H; i++) {
        	for(int j = 0; j<W; j++) {
        		if(isShowable[j] && arr[i][j] != '\u0000') {
        			System.out.print(arr[i][j]);
        		}
        		
        	}
        	if(isLnable[i]) {
        		System.out.println();
        	}
        }
        
	}

}
