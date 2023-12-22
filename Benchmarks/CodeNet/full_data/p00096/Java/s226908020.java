import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> ans = new ArrayDeque<Integer>();
 
        while(sc.hasNext()){
            long count=0;
            int t = 0;
            int n = sc.nextInt();
            for(int a=0;a<=1000;a++){
            	t = n-a;
            	if(t>=0 && t<=3000){
	            	for(int b=0;b<=1000;b++){
	            		t = n-(a+b);
	            		if(t>=0 && t<=2000){
		            		for(int c=0;c<=1000;c++){
		            			t = n-(a+b+c);
		                        if(t>=0 && t<=1000)count++;
		                    }
	            		}
	                }
            	}
            }
            System.out.println(count);
        }
    }
}