import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	int t = 0;
            int count = 0;
            
            
            for(int a=0;a<=1000;a++){
            	t = n-a;
            	if(t>=0 && t<=3000){
	            	for(int b=a;b<=1000;b++){
	            		t = n-(a+b);
	            		if(t>=0 && t<=2000){
		            		for(int c=b;c<=1000;c++){
		            			t = n-(a+b+c);
		                        if(t>=0 && t<=1000 && t>=a && t>=b && t>=c){
		                        	if(a==b && b==c && c==t) count++;
		                        	else if((a==b && b==c) || (b==c && c==t) || (c==t && t==a)) count+=4;
		                        	else if((a==b && c==t) || (b==c && t==a) || (t==b && a==c)) count+=6;
		                        	else if(a==b || b==c || c==t || t==a) count+=12;
		                        	else count+=24;
                        			//System.out.println(a + " " + b + " " + c + " " + t);
		                        }
		                    }
	            		}
	                }
            	}
            }
            
            System.out.println(count);
        }
    }
}