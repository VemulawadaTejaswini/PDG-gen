import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int n;
    static Scanner sc = new Scanner(System.in);
    
    static boolean aun(){
        Stack<String> au = new Stack<>();
        for(int i=0;i<n;i++){
            String say = sc.next();
            if(say == "A"){
                au.push("A");
            }
            if(say == "Un"){
                if(au.isEmpty()){
                    return false;
                }else{
                    au.pop();
                }
            }
            System.err.println(au);
        }
        if(au.isEmpty()){
        	return true;
        }else {
        	return false;
        }
    }
    
    public static void main(String[] args) {
        n = sc.nextInt();
        if(n%2 == 1) {
        	System.out.println("NO");
        	return;
        }
        if(aun()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }    
    }
}
