
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] a = new int[n];
		boolean b = false;
		for (int i=0;i<n;i++){
			a[i] = sc.nextInt();
			if (a[i]>=n){
				b = true;
			}
		}
		if (b==true){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}
}