import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        String n = sc.next();
        
        int a = 0;
        for(int i = 0; i < n.length(); i++){
            a += Integer.parseInt(n.substring(i, i+1));
        }
        if(a%9 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}