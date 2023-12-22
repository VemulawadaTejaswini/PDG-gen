import java.util.Scanner;
class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.printf("%.5f %.5f",(double)(r * r * Math.PI) , (double)(r * 2 * Math.PI));
    }
}