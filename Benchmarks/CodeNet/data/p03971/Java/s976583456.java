import java.util.*;
public class Main{
	private static String board = "CODEFESTIVAL2016";
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        while(cin.hasNext()){
        	int n = cin.nextInt();
        	int a = cin.nextInt();
        	int b = cin.nextInt();
            String s = cin.next();
            count(s,a,b,n);
        }
    }
    public static void count(String s,int a,int b,int n){
    	int pass=0,passb=0;
    	for(int i=0;i<n;i++){
    		if(s.charAt(i)=='c'){
    			System.out.println("No");
    		}else if(s.charAt(i)=='a'){
    			if(pass<a+b){
    				System.out.println("Yes");
    				pass++;
    			}else{
    				System.out.println("No");
    			}
    		}else{
    			if(pass<a+b&&passb<b){
    				System.out.println("Yes");
    				pass++;
    				passb++;
    			}else{
    				System.out.println("No");
    			}
    		}
    	}
    }
}