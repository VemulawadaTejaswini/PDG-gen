public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a[] = new int[s.nextInt()];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println(calc(a));
	}
	public static int calc(int a[]) {
		int count=0;
		for(int i=0;i<a.length-2;i++) {
			if((a[i]<a[i+1] && a[i+1]<a[i+2])||
					(a[i]>a[i+1] && a[i+1]>a[i+2])){
				count++;
			}
		}
		return count;
	}
}
