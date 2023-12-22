import java.util.Scanner;

class Main{
	public static void main(String[] arg){
	
		
		Scanner sc = new Scanner(System.in);
		String str; 
		int m,n;
		
                     while(true){
			
			 str=sc.next();
		
			if(str.equals("-")){
				break;
			}
			   m=sc.nextInt();
			for(int i=0;i<m;i++){
				n=sc.nextInt();
				str=str.substring(n)+str.substring(0,n);
			}
                        System.out.println(str);
		}
		
		
		
}}
