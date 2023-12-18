import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        long k = Long.parseLong(sc.next());
        
        int a = 0;
        int b = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '1'){
                a = i+1;
                b = Integer.parseInt(s.substring(i, i+1));
                break;
            }
        }
        
        if(k < a){
            System.out.println(1);
        }else{
            System.out.println(b);
        }
    }
}