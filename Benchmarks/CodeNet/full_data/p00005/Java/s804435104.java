import java.util.*;
public class Main{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
	int count;
	int kouyaku = 0;;
	int koubai = 0;;
while(sc.hasNext()){
	int a =sc.nextInt();
	int b =sc.nextInt();
	for( count=2;count<=a || count<=b;count++){
		if(a%count==0 && b%count==0){
			kouyaku = count;
		}
	}
		koubai = ( a * b) / kouyaku;
		System.out.println(kouyaku+" "+koubai);
}

		}


	}