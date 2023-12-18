import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] a = new String[N];
		for(int i = 0;i<N;i++) {
			a[i]=sc.next();
		}
		int anagramct=0;
		for(int j=0;j<N;j++) {
			for(int k= j+1;k<N;k++) {
		anagramct += MyisAnagram(a[j],a[k]);				
			}
		}
		System.out.print(anagramct);

	}
	static int MyisAnagram(String word1,String word2){
        int sumCode_1=0;
        int sumCode_2=0;
        char []chars1 =word1.toCharArray();
        char []chars2 = word2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String sorted1 = new String(chars1);
        String sorted2 = new String(chars2);
        if(sorted1.equals(sorted2)) {
        return 1;
        }
        else {
        	return 0;
        }

    }
}
