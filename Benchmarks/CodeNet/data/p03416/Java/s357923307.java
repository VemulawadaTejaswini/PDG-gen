import java.util.Scanner;

public class Main{
    public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int r=0;
			for(int i=a; i<b; i++){
				int s=i%10;
				int t=i/10000%10;
				int u=i/10%10;
				int v=i/1000%10;
				if(s==t && u==v)r++;
			}
			System.out.println(r);
    }
}
