import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int counter = 0;
        for(int x = 0; x < n; x++ ){
            int k = scan.nextInt();
            if(isPrime(k)){
                counter++;
            }
        }
        System.out.println(counter);

    }
    public static boolean isPrime(int k){
        if(k == 2){
            return true;
        }
        else if(k % 2 == 0){
            return false;
        }
        else{
            for(int p =3; p < k; p += 2){
                if(k % p == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
