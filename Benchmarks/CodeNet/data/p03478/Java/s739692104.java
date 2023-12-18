import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = 0;
    for(int i=1; i<=n; i++) {
    	if(i<=9 && a<=i && i<=b) {
    		ans += i;
    	}else if(10<=i && i<=99) {
    		if(a <= i/10 + i%10 && i/10 + i%10 <= b) {
    			ans += i;   				
    			}
      	}else if(100<=i && i<=999) {
      		if(a <= i/100 + (i%100)/10 + (i%100) && i/100 + (i%100)/10 + (i%100) <= b) {
      			ans += i;
      		}
      	}else if(1000<=i && i<=9999) {
      		if (a <= i/1000 + (i%1000)/100 + ((i%1000)%100)/10 +(i%100) && i/1000 + (i%1000)/100 + ((i%1000)%100)/10 +(i%100)<= b) {
      			ans += i;
      		}
      	}else if(i== 10000){
    		if(a==1 && b==1) {
    			ans += i;
    	}
    }
    }
        	System.out.println(ans);
      }
}