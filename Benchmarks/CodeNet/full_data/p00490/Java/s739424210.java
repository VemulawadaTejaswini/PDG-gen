import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int top = in.nextInt();
		int kizi = in.nextInt();
		int cost = in.nextInt();
		int kcal = in.nextInt();
		int ping[] = new int[top];
		int cnt=0;
		for(int i=0;i<top;i++)ping[i]=in.nextInt();
		java.util.Arrays.sort(ping);
		for(int s=top-1;s>=0;s--){
			if(kcal/(kizi+cost*cnt)<(kcal+ping[s])/(kizi+cost*(cnt+1))){
				kcal+=ping[s];
				cnt++;
			}else break;
		}
		System.out.println(kcal/(kizi+cost*cnt));
	}
}