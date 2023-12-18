import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Easy {
	static Cara c[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = sc.nextInt();
		c = new Cara[l];
		for(int i = 0;i < n;i++){
			c[i] = new Cara(sc.next(), l);
		}

		Arrays.sort(c, new Comparator<Cara>(){
			public int compare(Cara a, Cara b){
				int i = 0;
				while(i < l){
					if(a.a[i] > b.a[i]){
						return 1;
					}else if(a.a[i] < b.a[i]){
						return -1;
					}
					i++;
				}
				return 0;
			}
		});

		String answer = "";
		for(int i = 0;i < c.length;i++){
			answer += c[i].a1;
		}

		System.out.println(answer);
	}
}

class Cara{
	char []a;
	String a1;

	Cara(String a,int length){
		this.a = new char[length];
		this.a1 = a;
		this.a = a.toCharArray();
	}
}