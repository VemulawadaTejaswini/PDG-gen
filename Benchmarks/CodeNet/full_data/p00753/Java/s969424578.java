import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        Scanner sc = new Scanner(new File("in.txt"));
        while(sc.hasNext()){
            int temp = sc.nextInt();
            if(temp==0) break;
            System.out.println(solve(temp));
        }
    }

    static int solve(int num){
        int ans=0;
        for(int i=num+1;i<=2*num;i++){
            if(primeChecker(i)) ans++;
        }
        return ans;
    }

    static boolean primeChecker(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
}