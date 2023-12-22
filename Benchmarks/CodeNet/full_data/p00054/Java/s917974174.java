import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNext()){
    		int a = input.nextInt();
    		int b = input.nextInt();
    		int n = input.nextInt();
    		System.out.println(doub(a,b,n));
    	}
    }
    
    public static int doub(int a,int b,int n){
    	double frac = (double)a/b;
    	int sum = 0;
    	String fracst = String.valueOf(frac);
    	int index = fracst.indexOf(".")+1;
    	for(int i = index ; i <= index+n-1 ; i++){
    		if(i < fracst.length()){
    			sum += fracst.charAt(i)-48;
    		}
    	}
    	return sum;
    }
}