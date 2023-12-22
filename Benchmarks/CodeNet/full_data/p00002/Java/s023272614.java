import java.util.Scanner;
class Main{
    public static void main(String[] a){
    	int fa = 0;
    	int fb = 0;
    	Scanner scan = new Scanner(System.in);
    	while (true){
    	fa = scan.nextInt();
    	fb = scan.nextInt();
    	int sum = fa + fb;
    	int time = (int) Math.log10(sum) + 1;
    	 System.out.println(time);
    	}
    }
 }