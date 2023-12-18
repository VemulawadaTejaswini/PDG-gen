import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int a_copy[] = new int[n-1];
            int index = 0;
            while (index < n) {
                if (index < i) {
                    a_copy[index] = a[index];
                } else if(index > i) {
                    a_copy[index - 1] = a[index];
                }
                index++;
            }

            int max = a_copy[0];
            for (int j = 1; j < n-1; j++) {
                if (max < a_copy[j]) {
                    max = a_copy[j];
                }
            }

            System.out.println(max);
        }
	}
}
