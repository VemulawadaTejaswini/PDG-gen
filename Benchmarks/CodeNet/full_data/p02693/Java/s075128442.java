import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        boolean ans = false;
        for(int i = A; i < B+1; i++){
        	if(i % K == 0){
        		ans = true;
        		break;
        	}
        }
        System.out.println(ans?"OK":"NG");
    }
}