import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int A = in.nextInt(); int B = in.nextInt(); String S = in.next();
        char c[]=S.toCharArray();
        boolean b = false;
        for(char cc : c){
            if( cc == '-'){
                b = true;
                break;
            }
        }
            if ( b == true){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        
                
	}
}