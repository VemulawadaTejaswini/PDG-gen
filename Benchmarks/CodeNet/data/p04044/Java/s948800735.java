import java.util.Scanner;

public class Main {
	static Cara c[];
	static int l;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		l = sc.nextInt();
		c = new Cara[l];
		for(int i = 0;i < n;i++){
			c[i] = new Cara(sc.next(), l);
		}

		/*Arrays.sort(c, new Comparator<Cara>(){
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
		});*/
		sort(c);

		String answer = "";
		for(int i = 0;i < c.length;i++){
			answer += c[i].a1;
		}

		System.out.println(answer);
	}

	static void sort(Cara[] c){
		for(int i = 0;i < c.length-1;i++){
			for(int j = i+1;j < c.length;j++){
				Cara a1 = c[j-1];
				Cara b1 = c[j];
				int k = 0;
				while(k < l){
					if(a1.a[k] > b1.a[k]){
						swap(c, j-1, j);
						break;
					}else if(a1.a[k] < b1.a[k]){
						break;
					}
					k++;
				}
			}
		}
	}

	static void swap(Cara[] c,int a, int b){
		Cara c1 = c[a];
		c[a] = c[b];
		c[b] = c1;
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
