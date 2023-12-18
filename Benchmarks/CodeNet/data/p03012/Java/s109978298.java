import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int min = 0;
        int index = 0;
        int data[] = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            min = data[i];
            index = i;
            for (int j = i+1; j < n; j++) {
                if (min > data[j]) {
                    min = data[j];
                    index = j;
                }
            }
            data[index] = data[i];
            data[i] = min;
        }
        for (int  i = 0; i < n; i++) {
        }

        int s1 = 0;
        int s2 = 0;

        for (int i = n-1; i >= 0; i--) {
            if (s1 < s2) {
                s1 += data[i];
            } else {
                s2 += data[i];
            }
        }

        if (s1 >= s2) {
            System.out.println(s1 - s2);
        } else {
            System.out.println(s2 - s1);
        }
	}
}