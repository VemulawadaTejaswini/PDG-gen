import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i=0; ;i++){
			int x = sc.nextInt();
			if(x!=0){
				System.out.printf("Case %d: %d\n",i, x);
			}
			else{
				break;
			}
		}
	}

}