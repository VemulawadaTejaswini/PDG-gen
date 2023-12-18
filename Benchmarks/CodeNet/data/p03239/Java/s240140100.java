import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		int n,T,i,c,t,min;
        i = 0;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		T = sc.nextInt();

		while(i < n){
			t = sc.nextInt();
			c = sc.nextINt();
			if(t <= T){
				min = c;
			}
            i++;
		}
      System.out.println(min);
		return;
	}
}