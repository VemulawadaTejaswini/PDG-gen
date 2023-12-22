import java.util.Scanner;
public class Main {
    static void Roll(int[] a,int k,int b){
        a[0]=a[1];
        a[1]=a[k];
        a[k]=a[6];
        a[6]=a[b];
        a[b]=a[0];
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[7];
		for (int i = 1; i < 7; i++) {
			a[i] = scanner.nextInt();
		}

		char[] b = scanner.next().toCharArray();
		for (int i = 0; i < b.length; i++) {
		    if (b[i] == 'N') {
		        Roll(a,2,5);
		    }else if (b[i] == 'S') {
		        Roll(a,5,2);
		    }else if (b[i] == 'W') {
		        Roll(a,3,4);
		    }else{
		        Roll(a,4,3);
		    }
		}
		
		
		System.out.println(a[1]);
	}
}
