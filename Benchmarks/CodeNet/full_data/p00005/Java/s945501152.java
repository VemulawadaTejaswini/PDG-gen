import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int a;
    	int b;
    	while (scan.hasNextInt()){
    		a = scan.nextInt();
    		b = scan.nextInt();
    		ArrayList<Integer> comfac = new ArrayList<Integer>();
    		
    		System.out.println(isprime(a) + " " + isprime(b));
    		while (!isprime(a) || !isprime(b)){
    			
    			int fac;
    			if (minfactor(a) == minfactor(b)){
    				fac = minfactor(a);
    				a = a / fac;
    				b = b / fac;
    				comfac.add(fac);
    			}else if(minfactor(a) < minfactor(b)){
    				fac = minfactor(b);
    				if(a % fac == 0){
    					a = a / fac;
    					b = b / fac;
    					comfac.add(fac);
    				}else{
    					fac = 5;
    					if(a % fac == 0 && b % 5 == 0){
    						a = a / fac;
    						b = b / fac;
    						comfac.add(fac);
    					}else{
    						break;
    					}
    				}
    			}else if(minfactor(a) > minfactor(b)){
    				fac = minfactor(a);
    				if(b % fac == 0){
    					a = a / fac;
    					b = b / fac;
    					comfac.add(fac);
    				}else{
    					fac = 5;
    					if(a % fac == 0 && b % 5 == 0){
    						a = a / fac;
    						b = b / fac;
    						comfac.add(fac);
    					}else{
    						break;
    					}
    				}
    			}
    		}
    		
    		if(a == b){
    			comfac.add(a);
    		}
    		
    		int result = 1;
    		for(Integer value : comfac){
    			result = result * value;
    		}
    		System.out.println(result);
    	}
    }
    
    public static int minfactor(int n){
    	if (n % 2 == 0) return 2;
    	if (n % 3 == 0) return 3;
    	if (n % 5 == 0) return 5;
    	
    	int m = 7;
    	while (m*m <= n){
    		if (m*m == n){
    			return m;
    		}
    		m += 2;
    	}
    	
    	return n;
    }
    
    public static boolean isprime(int n){
    	if(minfactor(n) == n){
    		return true;
    	}else{
    		return false;
    	}
    }
}