import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int gcd;
        
        gcd = gojoho(x,y);
        System.out.println(gcd);
    }
        
    private static int gojoho(int x,int y){
        while(true){
            if(x >= y){
                x = x % y;
            }else{
                y = y % x;
            }
        	if(x == 0 || y == 0){
        		break;
        	}
        }
    	int gcd;
    	if(x == 0){
    		gcd = y;
    	}else{
    		gcd = x;
    	}
        return gcd;
    }
}
