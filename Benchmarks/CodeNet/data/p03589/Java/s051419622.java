import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N%2 == 0){
			System.out.println(N/2 + " " + N + " " + N);
		} else {
		outer:{for(int n = 1; n <= 3500; n++){
				for(int h = 1; h <= 3500; h++){
					if(n*h*N%(4*n*h-n*N-h*N) == 0){
				　　　　System.out.println(n + " " + h + " " + n*h*N/(4*n*h-n*N-h*N));
						break outer;
					}
				}
		}
			}
		}
    }
}