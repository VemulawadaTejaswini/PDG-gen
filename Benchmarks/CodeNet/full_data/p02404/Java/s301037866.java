import java.util.Scanner;
 public class Main{

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while(true){
           int H = sc.nextInt();
           int W= sc.nextInt();
        for( int i = 0; i<H; i++ ){
            for( int n = 0; n<W; n++ ){
                if(i==0||i==H-1||n==0||n==W-1){
                 System.out.print("#");
                }else{
                 System.out.print(".");
                }
            }
        System.out.println();
       }
        if(H==0&&W==0)break;   
         System.out.println();

       }
	}
 }
