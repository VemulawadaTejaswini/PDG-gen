import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a, b, c;
        String flag;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        
        if ((a < b) && (b < c)){
            flag = "Yes";
        }else{
            flag = "No";
        }
        System.out.println(flag);
    }
}
