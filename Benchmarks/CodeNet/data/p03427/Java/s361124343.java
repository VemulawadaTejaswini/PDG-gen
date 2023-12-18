import java.util.Scanner;

class Main {

	
          
    public static void main(String[] str) {
    	Scanner sc= new Scanner(System.in);
    	String num=sc.next();
    	System.out.println(solution(num));
    	sc.close();
    }
    
 public static int solution(String num) {
	 
	 if(num.length()<=1) {
		 
		 return Integer.valueOf(num);
	 }
	 
	 int op1= (num.charAt(0)-'1')+(num.length()-1)*9;
	 int op2=0;
	 for(int i=0;i<num.length();i++) {
		 op2+=num.charAt(i)-'0';
	 }
	return Math.max(op1, op2);
 }
}