import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        char[] N = sc.next().toCharArray();
        int res=0;
        
        for(int i=0; i<N.length; i++){
            res = (res + Character.getNumericValue(N[i]))%9;
        }
        
        if(res%9==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
        
        
        }
    }