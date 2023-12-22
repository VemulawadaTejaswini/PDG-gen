import java.util.Scanner;


public class Main {
   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
	   while(sc.hasNext()){
		   new Main();
	   }
   }

   public Main() {
       new aoj0195().doIt();
   }
   class aoj0195 { 
	   String hitandblow(int a[], int b[]) {
		   int hit = 0;
			int hblow = 0;
			int blow = 0;
			String result = "";
			for (int i = 0; i < 4; i++) {
				if (a[i] == b[i]) {
					hit++;
				}
			}
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (a[i] == b[j]) {
						if(i != j){
							hblow++;
						}
					}
				}
			}
			blow = hblow ;

			result = hit + " " + hblow;

			return result;
		}
	   
       void doIt() {
   		int A[] = new int[4];
   		int B[] = new int[4];

   		for (int i = 0; i < 4; i++) {
   			A[i] = sc.nextInt();
   		}
   		for (int i = 0; i < 4; i++) {
   			B[i] = sc.nextInt();
   		}
   		System.out.println(hitandblow(A, B));
       }
   }
}