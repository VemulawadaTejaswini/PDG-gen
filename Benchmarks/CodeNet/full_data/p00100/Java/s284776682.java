import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        
        while(true){
        	int n=scan.nextInt();
        	if(n==0)break;
        	int syatiku[] =new int[4001];
        	for(int i=0;i<n;i++){
        		syatiku[scan.nextInt()]+=scan.nextInt()*scan.nextInt();
        	}
        	boolean flag =true;
        	for(int i=1;i<=4000;i++){
        		if(syatiku[i]>=1000000){
        			System.out.println(i);
        			flag =false;
        		}
        	}
        	if(flag)System.out.println("NA");
  
        
        }
    }
}