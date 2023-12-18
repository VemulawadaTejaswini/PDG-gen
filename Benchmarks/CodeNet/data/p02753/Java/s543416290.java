import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
       
		String s=sc.next();
		String[] a=s.split("");
    
 	if(a[0].equals(a[1])&&a[1].equals(a[2])){
    		System.out.println("No");
    	}else{
     		System.out.println("Yes");
   	 }

    	
    }
}