import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s1 = new String(sc.nextLine());
        String s2 = new String();
        int c=0;
        
        while(true){
        	s2 = sc.next();
        	if(s2.equals("END_OF_TEXT")){
        		sc.close();
        		break;
        	}
        	if(s2.equalsIgnoreCase(s1)){
        		c++;
        	}
        }
        System.out.println(c);
    }

}
