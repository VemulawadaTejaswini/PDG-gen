import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        
        int a = 0;
        for(int i = 0; i < n; i++){
            a += Integer.parseInt(sc.next());
        }
        
        if(a >= h){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}