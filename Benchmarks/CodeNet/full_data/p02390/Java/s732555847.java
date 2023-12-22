import java.util.Scanner;
public class Main{
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int time[] = new int[3];
	        int x = sc.nextInt();


	        time[0]=x/3600;
	        x = x-time[0]*3600;
	        time[1]=x/60;
	        time[2]=x%60;
	        System.out.println(time[0]+":"+time[1]+":"+time[2]);
	        sc.close();
	}
}

