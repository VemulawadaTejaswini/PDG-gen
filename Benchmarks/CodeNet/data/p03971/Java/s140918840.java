package trial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N=0,A=0,B=0;
        int num = 0;
        int fo=0;
        String S;
        char[] c;
        
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        S = sc.next();
        c = S.toCharArray();
        
        
        for(int i=0;i<c.length;i++){
        	if(c[i]=='a' && num<A+B){
        		System.out.println("Yes");
        		num++;
        	}else if(c[i]=='a' && num>=A+B){
        		System.out.println("No");
        	}else if(c[i]=='b' && num<A+B && fo<B){
        		System.out.println("Yes");
        		num++;
        		fo++;
        	}else if(c[i]=='c'){
        		System.out.println("No");
        	}else{
        		System.out.println("No");
        	}
        }
    }
}