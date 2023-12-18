import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input N A1 A2 A3 ... AN
        // N は3の倍数、Ai は3種類でないといけない
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numA = sc.nextInt();
        int numB = 0;
        int numC = 0;
        int numNum = 1;
        if(num % 3 != 0){
            System.out.println("No");
            return;
        }
        for(int i = 1; i < num; i++){
            int tempNum = sc.nextInt();
            if(tempNum == numA){
                continue;
            } else {
                if(numNum == 1){
                    numB = tempNum;
                    numNum = 2;
                    continue;
                } else if(tempNum == numB){
                    continue;
                } else {
                    if(numNum == 2){
                        numC = tempNum;
                        numNum = 3;
                        continue;
                    } else if(tempNum == numC){
                        continue;
                    } else {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        if(numNum == 3){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
