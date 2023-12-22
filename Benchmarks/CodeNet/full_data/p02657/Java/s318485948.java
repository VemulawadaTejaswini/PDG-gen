import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numa = scan.nextInt();
        int numb = scan.nextInt();
        int ans = 0;
        int i;
        
        for(i=0;i<=numb-1;i++){
           ans = ans +numa;
        }   
	    System.out.println(ans);
        scan.close();
    }
}