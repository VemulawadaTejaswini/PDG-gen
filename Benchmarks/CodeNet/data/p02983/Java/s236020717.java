import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
	
    
 	if((r-l)>=2018){
    		System.out.println(0);
    	}else if((r-l)<(2019-l%2019)){
     		System.out.println((l%2019)*((l+1)%2019));
   	 }else{

    	System.out.println(0);
    }
    }
}
