import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int taro=0;
		int hanako=0;
		String first = scan.next();
		String second = scan.next();
		for(int i=0;i<n;i++){
			if((first.compareTo(second)) == 1)
				taro+=3;
			else if((first.compareTo(second)) == -1)
				hanako+=3;
			else{
				taro++;
				hanako++;
			}if(i!=n-1){
			first = scan.next();
			second = scan.next();
			}
		}
		System.out.println(taro+" "+hanako);
	}
}