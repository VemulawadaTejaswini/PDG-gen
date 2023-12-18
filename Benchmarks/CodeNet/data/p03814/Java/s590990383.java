import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[]ss = S.toCharArray();
        ArrayList<Integer>a = new ArrayList<>();
        ArrayList<Integer>z = new ArrayList<>();
        
        for(int i=0; i<S.length(); i++) {     	
        	if(ss[i] == 'A') {
        		a.add(i);
        	}else if(ss[i] == 'Z') {
            	z.add(i);
        	}
        }
        Collections.sort(a);
        Collections.sort(z,Collections.reverseOrder());

        System.out.print(z.get(0) - a.get(0) + 1);
        }
    }
