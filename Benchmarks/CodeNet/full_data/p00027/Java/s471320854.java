import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		while(sc.hasNext()){
			int month[] = {31,29,31,30,31,30,31,31,30,31,30,31};
			int in1 = sc.nextInt()-1;
			int day = 0;
			String youbi[] = {"Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"};
			for(int i = 0; i<in1; i++){
				day += month[i];
			}
			int in2 = sc.nextInt();
			if(in2 == 0){
				continue;
			}
			day += --in2;
			day %= 7;
			System.out.println(youbi[day]);
		}	
	}
}