import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        double sum = 0.0;
        for(int i = 0;i < n;i++){
            int a = sc.nextInt();
            sum += 1.0 / a;
        }
        System.out.println(1.0 / sum);
    }
}