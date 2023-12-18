import java.util.Scanner;

    public class Main {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
    		int x =0;
    		int max=0;
    		String s = sc.next();
    		String tmp= "";
    		for(int i=0;i<n;i++) {
    			tmp=s.substring(i, i+1);
    			if(tmp.equals("I")){
    				x++;
    			}
    			else {
    				x--;
    			}
    			if(max<x) {
    				max=x;
    			}
    		}
    		System.out.println(max);
    	}
    }