import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 1;
        if(a > 0 & a <= (10*10*10*10*10)){
        	for(int i = 1; i <= a; i++){
        		sum = sum*i;
        	}
        	sum = sum % (10*10*10*10*10*10*10*10*10+7);
        }
        System.out.println(sum);
        }
}