import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s1 = new String(sc.nextLine());
        String s2 = new String(s1+s1);
        String s3 = new String(sc.nextLine());
        
        if(s2.indexOf(s3) != -1){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
        sc.close();
    }
 
}
