import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("1")) cnt++;
        }
        
        scan.close();
        System.out.println(cnt);
    }
}