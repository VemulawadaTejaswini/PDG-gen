import java.util.Scanner;
public class Main{
    static int stack[]=new int[101];
	public static void main(String[] args) {
		int i=0;
		String s;
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
	s=sc.next();
    while(true){
    	if(Number(s)){
    	 i++;
    	 stack[i]=Integer.parseInt(s);
    	 }else{
    		 if(s.equals("+")){
    			 stack[i-1]=stack[i-1]+stack[i];
    			 i--;
    		 }
    		if(s.equals("-")){
    			stack[i-1]=stack[i-1]-stack[i];
    			i--;
    		}
    		if(s.equals("*")){
    			stack[i-1]=stack[i-1]*stack[i];
    			i--;
    		}
    		if(s.equals("/")){
    			stack[i-1]=stack[i-1]/stack[i];
    			i--;
    		}
    	 
     }
    	if(!sc.hasNext()) break;
    	s=sc.next();
    }
    System.out.println(stack[1]);
	}
	public static boolean Number(String a){
		try{
			Integer.parseInt(a);
		return true ;
		}catch(Exception e){
		return false;
	}
}
}
