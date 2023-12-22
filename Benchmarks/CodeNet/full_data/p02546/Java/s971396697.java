import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n;
        
        n=s.length();
        
        String X;
        
        X=s.substring(n-1);
        if(X=="s") {
        	 System.out.println(s+"es");
        } else {
        	 System.out.println(s+"s");
        }
        
    
       
    }
}

