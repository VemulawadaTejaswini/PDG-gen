import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        
        String s=sc.next();
  		int a=Integer.parseInt(s.substring(0,2));
        int b=Integer.parseInt(s.substring(2,4));

 	if(a<13&&a>0&&b>0&&b<13){
    		System.out.println("AMBIGUOUS");
    	}else if(a<13&&a>0){
     		System.out.println("MMYY");
   	 }else if(b<13&&b>0){
    	System.out.println("YYMM");
    }else{

    	System.out.println("NA");
    }
    }
}

