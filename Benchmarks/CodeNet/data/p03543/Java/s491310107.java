import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();

	int[] num = new int[10];
	for(int i = 0; i < 4; i++){
	    num[n % 10]++;
	    n /= 10;
	}

	int flag = -1;
	for(int i = 0; i < 10; i++){
	    if(num[i] >= 3){
		flag = 1;
	    }
	}

	if(flag == 1){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
