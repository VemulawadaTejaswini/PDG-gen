
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long money = 100;
        long count = 0;
        
        while(money < X) {
        	double doubleMoney;
        	doubleMoney = money * 1.01;
        	money = (long) doubleMoney;
        	count++;
        }
        
        System.out.println(count);

        

        
        }
	}

