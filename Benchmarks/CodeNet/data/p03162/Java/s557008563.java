package vacation;
import java.util.*;

public class vacation{
	public static int[][] arr;
	public static int n;
	public static int max = 0;
	public static void fn(int day, int choice, int fun){
		if (day == n){
			if (fun>max)
				max = fun;
		}
		else{
		if (choice==0){
			fn(day+1,2,fun+arr[day][choice]);
			fn(day+1,1,fun+arr[day][choice]);}
		if (choice==1){
			fn(day+1,2,fun+arr[day][choice]);
			fn(day+1,0,fun+arr[day][choice]);}
		if (choice==2){
			fn(day+1,0,fun+arr[day][choice]);
			fn(day+1,1,fun+arr[day][choice]);}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][3];
		int i = 0;
		int j = 0;
		for(i=0;i<n;i+=1)
			for(j=0;j<3;j+=1)
				arr[i][j] = sc.nextInt();
		fn(0,0,0);
		fn(0,1,0);
		fn(0,2,0);
		System.out.println(max);
	}
}
