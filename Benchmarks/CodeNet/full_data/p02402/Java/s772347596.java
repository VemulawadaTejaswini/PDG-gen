import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // ??´??°?????° n
		int i;
		int num = scan.nextInt();
		int min = num,max = num,sum = num;
		for(i = 0;i < n - 1;i++){
			num = scan.nextInt(); // ??´??°??\???
			sum += num;
			if(min > num){min = num;}
			if(max < num){max = num;}
		}
	System.out.println(min + " " + max + " " + sum);
	}
}