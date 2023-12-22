import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            while(true){
            	int n = scan.nextInt();
            	if(n==0)break;
            	int [] s = new int [n];
            	for(int i=0;i<n;i++)s[i]=scan.nextInt();
            	int st = 32;
            	while(st!=0){
            	for(int i=0;i<n;i++){
            		st -= (st-1)%5;
            		System.out.println(st);
            		st -=s[i];
            		if(st<=0){st=0;
            		System.out.println(st);
            		break;
            		}
            		System.out.println(st);
            	}
            	
            }
            
        }
        }
}