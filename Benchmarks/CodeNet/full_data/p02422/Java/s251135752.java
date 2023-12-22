import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            String order = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(order.equals("print")){
                System.out.println(str.substring(a, b+1));
                
            }else if(order.equals("reverse")){
                String rev = str.substring(a, b+1);
                String temp = str.substring(b+1);
                str = str.substring(0, a);
                for (int index=rev.length()-1; index>=0; index--) {
				str += rev.charAt(index);
			    }
		    	str += temp;

            }else{    
                String p = sc.next();
                str = str.substring(0,a) + p + str.substring(b+1);
            }
        }
        
    }
}
