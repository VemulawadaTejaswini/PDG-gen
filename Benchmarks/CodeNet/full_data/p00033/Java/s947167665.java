import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
        	
        int[] x = new int[10];
        boolean flag=true;
        for(int i=0; i<10; i++) x[i]=sc.nextInt();
        
        for(int i=2; i<10; i++)
        	if(x[i-2]>x[i]&&x[i-1]>x[i]) 
        		 flag=false;
        
        if(true==flag) System.out.println("YES");
        else System.out.println("NO");

    }
    }
}