import java.util.Scanner;
 
class InputSample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sheep = scan.nextInt();
        int wolf = scan.nextInt();
 		if((sheep > 0) && (sheep < 101) && (wolf > 0) && (wolf < 101)){
        	if (sheep > wolf){
            	System.out.println("safe");
            }else{
            	System.out.println("unsafe");
            }
        }scan.close();
    }
}
