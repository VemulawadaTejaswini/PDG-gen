import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int w = scan.nextInt(); // 縦線の数
	int[] narabi = new int[w]; // 現在の阿弥陀の数字の並び
	for (int i=0; i<w; i++)
	    narabi[i] = i+1;

	int n = scan.nextInt(); // 横線の数
        for (int i=0; i<n; i++) { // 交換
	    String[] str = scan.next().split(",",-1);
	    int a = Integer.parseInt(str[0])-1;
	    int b = Integer.parseInt(str[1])-1;
	    swap(narabi, a, b);
	}

	for (int i=0; i<w; i++)
	    System.out.println(narabi[i]);
	
    }

    private static void swap(int[] array, int n1, int n2) {
	int tmp = array[n1];
	array[n1] = array[n2];
	array[n2] = tmp;
    }
}