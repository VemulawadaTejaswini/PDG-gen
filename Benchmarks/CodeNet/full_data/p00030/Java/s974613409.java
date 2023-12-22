import java.util.Scanner;

public class Main {
	static final int MAX_VALUE=10;
	int choicevalue;
	int sumvalue;
	int choicecount = 0;

	void calc(int a, int b, int cv){
		if(cv != 0){
			for(int i = 1; i < MAX_VALUE; i++){
				if(sumvalue < a) break;
				calc(a + b, b + i, cv - 1);
			}
		}

		if(a + b == sumvalue && cv == 0){
			++choicecount;
		}
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			choicecount = 0;
			choicevalue = sc.nextInt();
			sumvalue = sc.nextInt();
			if(choicevalue == 0 && sumvalue == 0){
				break;
			}
			for(int i = 0; i < MAX_VALUE; i++){
				for(int j = i + 1; j < MAX_VALUE; j++){
					calc(i, j, choicevalue - 2);
				}
			}
			System.out.println(choicecount++);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}