import java.util.*;
public class Main{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
	int count;
	int yaku = 0;;
	int bai = 0;;
while(sc.hasNext()){
	int a =sc.nextInt();
	int b =sc.nextInt();
	for( count=2;count<=a || count<=b;count++){
		if(a%count==0 && b%count==0){
			yaku = count;
		}
	}
		bai = ( a * b) / yaku;
		System.out.println(yaku+" "+bai);
}

		}


	}