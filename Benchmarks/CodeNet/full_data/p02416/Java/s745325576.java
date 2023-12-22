import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        boolean j =true;
        int o;
        for(int i=0;;i++){
            String s = sc.nextLine();
        	o=0;
            	if(s.equals("0"))break;
            for(int a=0;a<s.length();a++){
            o+=(Character.getNumericValue(s.charAt(a)));
            }
            System.out.println(o);
        }
        sc.close();
    }
}
