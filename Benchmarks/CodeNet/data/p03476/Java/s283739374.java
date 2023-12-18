import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int Q=scanner.nextInt();
        for(int i=0;i<Q;i++){
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            System.out.println(countOfImitate(l,r));
        }
    }
    public static int countOfImitate(int l,int r){
        int result=0;
        for(int i=l;i<=r;i+=2){
            if(i==1) continue;
            if(isPrime(i)&&isPrime((i+1)/2)){
                result++;
            }
        }
        return result;
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
