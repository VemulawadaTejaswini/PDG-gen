import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int x = 0;
        
        while(true){
            x = sc.nextInt();
            if(x == 0)break;
            System.out.println("Case" + " " + i + ":" + " " + x);
            i++;
        }
        
    }
}

