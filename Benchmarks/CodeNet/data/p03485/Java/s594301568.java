import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();

		sort(cs , true);

//		System.out.println(new String(cs));

		sort(ct , false);

//		System.out.println(new String(ct));
		
		s = new String(cs);
		t = new String(ct);
		
		if( s.compareToIgnoreCase(t) < 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

	public static void sort(char[] a , boolean asc){
		int n = a.length;
		for(int i = 1 ; i < n ; ++i){
			char v = a[i];
			int j = i -1;
			if(asc){
				while(j >= 0 && Character.compare(v , a[j]) <= 0){
					a[j+1] = a[j];
					--j;
				}
			}else{
				while(j >= 0 && Character.compare(v , a[j]) >= 0){
					a[j+1] = a[j];
					--j;
				}
			}

			a[j+1] = v;
		}
	}
}
