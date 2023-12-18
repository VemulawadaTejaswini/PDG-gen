import java.util.Scanner;
java.lang.Math

public class Main {
	public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	int N1 = sc.nextInt();
	int tmp = 0;
    int anstmpA = 0;
    int ans = 100000000000;      

	for(int i = 1;i<10;i++)	{
        tmp = N1 / i;
		if ((N1 % i == 0)) {
			for (int j = 1; j < 10; j++) {
				if ((tmp % j == 0 ) && ((tmp / j) == 1 )) {
                  ans = Math.min( anstmpA, i+ j)
                  anstmpA = i + j ;                  
				}
			}
		}
	}
	System.out.println(anstmpA);
    }
}
