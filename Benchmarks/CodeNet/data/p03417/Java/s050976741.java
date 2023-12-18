import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long Max=sc.nextLong();
		long Min=sc.nextLong();
		long tmp=0;
		if(Max<Min){
			tmp=Max;
			Max=Min;
			Min=tmp;
		}
		long num=0;

		if(Max>=2 && Min>=2) num=(Max-2)*(Min-2);
		else if(Min==1 && Max>=2) num=1*(Max-2);
		else num=0;

		System.out.println(num);

	}
}