
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0||i%10==3){
                System.out.print(" "+i);
            }
        }

    }

}

