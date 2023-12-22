import java.util.*;
public class Main {

	static void calc() {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		int[] a = new int[8];
		for(int i=0; i<8; i++){ a[i] = t%10; t /= 10;}
		Arrays.sort(a);
		String min = a[0] +""+ a[1] +""+ a[2] +""+ a[3] +""+ a[4] +""+ a[5] +""+ a[6]+""+ a[7];
		String max = a[7] +""+ a[6] +""+ a[5] +""+ a[4] +""+ a[3] +""+ a[2] +""+ a[1]+""+ a[0];
		System.out.println(Long.parseLong(max)-Long.parseLong(min));
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){	calc(); n--;}
	}

}