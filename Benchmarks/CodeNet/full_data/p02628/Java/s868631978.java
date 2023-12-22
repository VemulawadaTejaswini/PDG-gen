import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int cnt = Integer.parseInt(sn.next());
        int y = Integer.parseInt(sn.next());
        int[] list = new int[cnt];
        int sum = 0;
        for ( int i = 0; i < cnt ; i++){
            list[i] = Integer.parseInt(sn.next());
        }
        Arrays.sort(list);
        for ( int l = 0; l < y ; l++){
            sum = sum + list[l];
        }
        System.out.println(sum);
	}
}

