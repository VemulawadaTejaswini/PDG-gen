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
        
        if((ab[1] - ab[0] + 1) >= K || ab[0] == K || ab[1] == K){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}