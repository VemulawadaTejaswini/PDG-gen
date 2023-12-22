import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int tmp[] = new int[num];
		for(int i=0; i<num; i++) {
			tmp[i]=sc.nextInt();
		}
        System.out.println(Arrays.toString(tmp).replaceAll("[,\\[\\]]", ""));
		for(int j=1;j<tmp.length;j++) {

			int key = tmp[j];
			int i=j-1;
			while(i>=0&&tmp[i]>key) {
				tmp[i+1] =tmp[i];
				i--;
			}
			tmp[i+1]=key;
            System.out.println(Arrays.toString(tmp).replaceAll("[,\\[\\]]", ""));
		}
	}
}
