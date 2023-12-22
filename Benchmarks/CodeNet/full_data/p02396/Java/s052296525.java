import java.util.Scanner;

class Main{
    public static void main(String[] args){
		int i = 0;
    	while(true){
    		int x = Integer.parseInt(args[i]);
    		if(x == 0) break;
    		System.out.println("Case "+(i+1)+": "+x);
    		i++;
    	}
    }
}