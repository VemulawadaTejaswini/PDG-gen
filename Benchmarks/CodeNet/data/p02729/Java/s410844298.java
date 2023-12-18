import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input N M
        Scanner sc = new Scanner(System.in);
        int evenNum = sc.nextInt();
        int oddNum = sc.nextInt();
        int resultNum = 0;
        if(1 < evenNum){
            for(int i = 1; i < evenNum; i++){
                resultNum += i;
            }
        }
        if(1 < oddNum){
            for(int i = 1; i < oddNum; i++){
                resultNum += i;
            }
        }
        System.out.println(resultNum);
    }
}
