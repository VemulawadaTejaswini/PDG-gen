import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),b=in.nextInt();
		int c=in.nextInt(),d=in.nextInt(),e=in.nextInt();
		int time=0;
		
		while(a<0){
			a++;
			time+=c;
		}
		
		if(a==0)time+=d;
		
		while(a<b){
			a++;
			time+=e;
		}
		
		System.out.println(time);
	}

}

