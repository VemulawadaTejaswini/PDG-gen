import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			int[] a = new int[8];
int[] b = new int[8];
			int hit = 0;
			int blow = 0;
			for(int i=0 ; i<4 ; i++)
				a[i] = s.nextInt();
			for(int i=0 ; i<4 ; i++){
				b[i] = s.nextInt();
				if(a[i] == b[i])
					hit += 1;
			}
			for(int i=0 ; i<4 ; i++){
				for(int j=0 ; j<4 ; j++){
					if(a[i]==a[j])
						blow += 1;
				}
			}
			System.out.println(hit+" "+blow);
		}
    }
}