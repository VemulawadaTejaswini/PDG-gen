import java.util.Scanner;
 
class Main{
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        if(a>=k){
            sum = k;
            System.out.println(sum);
            return;
        }else{
            sum += a;
            if(b>=k-a){
                System.out.println(sum);
                return;
            }else{
                sum -= k-a-b;
                System.out.println(sum);
            }
        }
    }
 
}