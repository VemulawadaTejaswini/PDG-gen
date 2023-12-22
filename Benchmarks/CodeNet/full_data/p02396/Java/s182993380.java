import java.util.Scanner;

public class Main {
	public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                for(int i=1; i>0; i++){
                        int iNum = scan.nextInt();
                        if(iNum == 0)
                                break;
                        System.out.println("Case " + i + ": " + iNum);
                }
	}
}