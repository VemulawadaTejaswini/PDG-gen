import java.util.Scanner;

public class Main{
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
        	if( Character.isUpperCase(s.charAt(i)) ){
        		System.out.print(Character.toLowerCase(s.charAt(i)));
            }else if( Character.isLowerCase(s.charAt(i)) ){
        		System.out.print(Character.toUpperCase(s.charAt(i)));
            }else{ 
            	System.out.print(s.charAt(i));
        }
        sc.close();
    }
   	System.out.println();
  }
}


