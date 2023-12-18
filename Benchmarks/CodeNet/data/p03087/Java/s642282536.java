import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();

		int q[] = new int[2*b];
		for(int i = 0 ; i < 2*b ; i ++){
			q[i] = sc.nextInt();
		}

		 String[] cArray = new String[a];
		 int[] countArray = new int[a+1];
		 for(int i = 0; i < a; i++){
			 cArray[i] = String.valueOf(c.charAt(i));
		 }

		 int index = 0;


		 for(int i = 0; i < a; i++){
			 index = c.indexOf("A",i);

			 if(index != -1 && cArray[i+1].equals("C")){
				// System.out.println(cArray[i]);
				// System.out.println(index);

				 for(int k = index ; k < a ; k++){
					 countArray[k+1] = countArray[k+1] + 1;
				 }
				 i = index;
			 }
		 }

		 /*
		 for(int k = 0 ; k < countArray.length ; k++){
			 System.out.println(countArray[k]);
		 }
	*/
		 int ans = 0;

		 for(int m = 0 ; m < 2*b ; m = m+2){

			 ans = countArray[q[m+1]-1] - countArray[q[m]-1];
			 System.out.println(ans);
		 }
	}
}