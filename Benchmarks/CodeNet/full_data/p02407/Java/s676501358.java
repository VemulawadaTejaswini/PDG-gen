import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int a[] = new int[100];  // 配列確保（大きめに）
        int n = scanner.nextInt(); // データ数
        int i;
        
        // データ入力
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
	  	
        for (i = n -1; i >=  0; i--) {
    	    System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        scanner.close();
  }
}

