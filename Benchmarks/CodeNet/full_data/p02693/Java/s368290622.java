import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int K = Integer.parseInt(scan.nextLine());
		String s = scan.nextLine();

		String[] AB = s.split(" ");
		int[] ab = new int[AB.length];
		
        for(int i = 0; i < AB.length; i++){
            ab[i] = Integer.parseInt(AB[i]);
        }
        
        for(int i = ab[0]; i <= ab[1]; i++){
            if(i % K == 0){
                System.out.println("OK");
                break;
            }else{
                continue;
            }
        }
        
    }
}