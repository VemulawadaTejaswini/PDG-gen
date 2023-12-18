public class Main {
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int n=stdin.nextInt();
		int a[]=new int [n];
		int i;
		for(i=0;i<n;i++){
			a[i]=stdin.nextInt();
		}
		int max=-300,min=300;
		for(i=0;i<n;i++){
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		int min2=Integer.MAX_VALUE;
		int p=0;
		for(i=min;i<=max;i++){
			p=0;
			for(int j=0;j<n;j++)
				p+=(a[j]-i)*(a[j]-i);

			if(p<min2)
				min2=p;
		}

		System.out.println(min2);
	}
}