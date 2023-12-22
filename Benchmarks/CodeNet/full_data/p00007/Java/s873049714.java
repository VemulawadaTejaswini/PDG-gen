import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int week = sc.nextInt();

	double money = 100000;
	for(int i=0; i<week; i++){
	    money = money + money*0.05;
	    if(money%1000!=0){
		money = money + (1000 - (money%1000));
	    }
	}

	System.out.println((int)money);
    }
}