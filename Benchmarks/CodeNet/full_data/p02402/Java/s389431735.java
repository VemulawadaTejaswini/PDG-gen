import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	int a[] = new int[10000];  // 配列確保（大きめに）
        int n = scanner.nextInt(); // データ数
        int max = -1000000;
        int min = 1000000;
        int sum = 0;
        int i;
        
        // データ入力
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
	  	
        for (i = 0; i < n; i++) {
            if(min > a[i])
            	min = a[i];
        }
        for (i = 0; i < n; i++) {
            if(max < a[i])
            	max = a[i];
        }
		for (i = 0; i < n; i++) {
        	sum += a[i];
        }
        
        System.out.println(min + " " + max + " " + sum  );
        
        scanner.close();
  }
}
