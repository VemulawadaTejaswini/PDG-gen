import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int total = 0;
            String str = sc.next();
            if(str.equals("0")){
                break;
            }
            for(int i=0;i<str.length();i++){
                total += str.charAt(i)-'0';
            }
            System.out.printf("%d\n", total);
        }
        sc.close();
    }
}

