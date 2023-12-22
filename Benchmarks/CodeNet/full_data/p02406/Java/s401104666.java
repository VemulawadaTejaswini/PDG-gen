package 配列０２;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	if(a<3 || a>10000) {
    		System.exit(0);
    	}
    	for(int i=1;i<=a;i++) {
    		if(i%3==0) {
    			System.out.print(" "+ i);
    		}else if(i % 10 == 3) {
    			System.out.print(" "+ i);
    		}else if(i %100 / 10 == 3) {
    			System.out.print(" "+ i);
    		}else if (i %100 ==3) {
    			System.out.print(" "+i);
    		}
    		
    	}
    	System.out.println();
    	sc.close();
     	}
    }

