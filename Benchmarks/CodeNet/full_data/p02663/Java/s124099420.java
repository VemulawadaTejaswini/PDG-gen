import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int k = sc.nextInt();
		int ans = (h2-h1)*60;
		
		if(m2>=m1){
		    ans = ans + (m2-m1);
		}else{
		    ans = ans-60 + m2+m1;
		}
		
		if(ans-k>0){
		    System.out.println(ans-k);
		}else{
		    System.out.println(0);
        }
    }
}