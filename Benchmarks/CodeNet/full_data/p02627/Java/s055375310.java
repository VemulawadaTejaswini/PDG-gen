import java.util.Scanner;

class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
	        String str1 = sc.next();  
			String moji = str1.toUpperCase();
        	if(str1 == moji){
            	System.out.println("A");
            }else{
            	System.out.println("a");
            }
    }
}