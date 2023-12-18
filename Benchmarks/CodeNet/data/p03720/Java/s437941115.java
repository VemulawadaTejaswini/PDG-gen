import java.util.Comparator;
import java.util.Scanner;

class Main{




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] count = new int[n+1];
		for(int i = 0;i < 2*m;i++){
			int x = sc.nextInt();
			count[x]++;
		}
		for(int i = 1;i <= n;i++){
			System.out.println(count[i]);
		}
	}

}

class MyComparator implements Comparator {
	 
    public int compare(Object obj1, Object obj2) {
         
        int num1 = (int)obj1;
        int num2 = (int)obj2;
         
        if(num1 < num2) {
            return 1;
        } else if(num1 > num2) {
            return -1;
        } else{
            return 0;
        }
    }
}


