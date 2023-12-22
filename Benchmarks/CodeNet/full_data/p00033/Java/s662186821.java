import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	
    Scanner sc =new Scanner(System.in);
    
    int n=sc.nextInt();int a[]=new int[10];
    for(int j=0;j<n;j++){
    	int b=0; int c=0;
    	String ans="YES";
    	for(int i=0;i<10;i++) a[i]=sc.nextInt(); 
    	for(int i=0;i<10;i++){
    
    		if(a[i]>b){
    			b=a[i];
    		}else if(a[i]>c){
    			c=a[i];
    		}else{
    			ans="NO";
    			break;
    		}
    	}
    	System.out.println(ans);
    }

    }
    
}