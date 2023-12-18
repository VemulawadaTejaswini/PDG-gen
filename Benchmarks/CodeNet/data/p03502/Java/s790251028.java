import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String n = scan.nextLine();
        int sum = 0;
        for(int i=0; i<n.length(); i++){
            sum += Integer.parseInt(n.substring(i, i+1));
        }
        String res = "No";
        if(Integer.parseInt(n) % sum == 0) res = "Yes";
        
        scan.close();
        System.out.println(res);
    }
}