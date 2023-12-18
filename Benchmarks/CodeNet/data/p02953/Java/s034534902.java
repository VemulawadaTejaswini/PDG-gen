import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
	int H[] = new int[N];
	boolean b[] = new boolean[N];
	for (int i = 0; i < N; i++) {
	    H[i] = sc.nextInt();
	    b[i] = true;
	}

	boolean bl_1 = true;
	for (int i = 1; i < N; i++) {
	    if (H[i] < H[i - 1]) {
		if (H[i - 1] - H[i] == 1 && b[i - 1]) {
		    H[i - 1]--;
		    b[i] = false;
		} else {
		    bl_1 =false;
		}
	    }
	}

	if(bl_1)
	    System.out.println("Yes");
	else
	    System.out.println("No");
    }
}