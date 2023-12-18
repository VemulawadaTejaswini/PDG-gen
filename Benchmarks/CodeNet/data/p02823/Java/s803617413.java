import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		Table_Tennis table = new Table_Tennis(number);
		System.out.println(table.getNumber(a, b));
	}
}
class Table_Tennis{
	private int number;
	private int count = 0;
	Table_Tennis(int number){
		this.number = number;
	}
	int getNumber(int a, int b){
		if((b-a)%2 == 1){
			this.count++;
			if((this.number - b) > a - 1){
				if(a-1 >= 1){
					this.getNumber(a-1, b-1);
				} else {
					this.getNumber(a, b-1);
				}
			} else if(b+1 <= this.number){
				this.getNumber(a+1, b+1);
			} else if(b+1 > this.number){
				this.getNumber(a+1, b);
			}
		}
		return ((b-a)/2 + this.count);
	}
}