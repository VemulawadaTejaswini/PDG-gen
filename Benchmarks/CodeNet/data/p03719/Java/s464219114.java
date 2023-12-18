import java.util.Comparator;
import java.util.Scanner;

class Main{




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(c >= a && c <= b){
			System.out.println("Yes");
		}else{
			System.out.println("No");

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


