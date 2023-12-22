import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = Integer.valueOf(scan.next());
        int b = Integer.valueOf(scan.next());
        int start = (a>=b)? b:a;
        for(int i=start;i>=1;i--) {
        	if(a%i==0&&b%i==0) {
        		System.out.println(i);
        		break;
        	}
        }
        scan.close();
    }
}
