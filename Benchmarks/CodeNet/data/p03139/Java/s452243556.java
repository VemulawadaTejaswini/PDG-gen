import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String res;
        if(a+b<n){
            res = Math.min(a,b) + " 0";
        }else{
            res = Math.min(a,b) + " " + (a+b-n);
        }
        System.out.println(res);
                
            
        
        
        
        
        
        }
    }