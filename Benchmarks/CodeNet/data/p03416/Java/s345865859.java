import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++){
            String sa = String.valueOf(i);
            if(sa.substring(0, 1).equals(sa.substring(4, 5)) 
                && sa.substring(1, 2).equals(sa.substring(3, 4))){
                    cnt++;
                }
        }

        System.out.println(cnt);

        scan.close();
    
    }

}