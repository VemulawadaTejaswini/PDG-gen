import java.util.Scanner;

public class Main{
       public static void main(String[] args){
       int i,j,k,a,b,c;
    	String[] data;
 
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        data = new String[k];
        i = 0;
        while(i < k){
        	a = scan.nextInt();
        	b = scan.nextInt();
        	c = scan.nextInt();
        	a=a*a;
        	b=b*b;
        	c=c*c;
        	if(a>b && a>c){
        		b = b + c;
        		if(a == b){
        			data[i]="Yes";
        		}else{
        			data[i]="No";
        		}
        	}else if(b>a && b>c){
        		a = a + c;
        		if(b == a){
        			data[i]="Yes";
        		}else{
        			data[i]="No";
        		}
        	}else if(c>a && c>b){
        		a = a + b;
        		if(c == a){
        			data[i]="Yes";
        		}else{
        			data[i]="No";
        		}
        	}else{
        		data[i]="No";
        	}
        	i++;
        }
        
        
        j = 0;
        while(j < i){
        	System.out.println(data[j]);
        	j++;
       		}
       		}
}