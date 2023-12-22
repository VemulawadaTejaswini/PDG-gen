import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	
    Scanner sc =new Scanner(System.in);
    
    int n=sc.nextInt();
    for(int j=0;j<n;j++){
    	int b=0; int c=0;
    	String ans="YES";
    	for(int i=0;i<10;i++){
    		int a=sc.nextInt();
    		if(a>b){
    			b=a;
    		}else if(a>c){
    			c=a;
    		}else{
    			ans="NO";
    			break;
    		}
    	}
    	System.out.println(ans);
    }

    }
    
}