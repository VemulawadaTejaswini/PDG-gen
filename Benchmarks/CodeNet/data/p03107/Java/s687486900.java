public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();;
		
		int n=a.length();
		int d[]=new int[n];
		int b=0,c=0;
		for(int i=0;i<n;i++) {
			d[i]=a.charAt(i)-48;
			if(d[i]==1)b++;
			else c++;
		}
		c*=2;b*=2;
		if(c<=b) System.out.print(c);
		else System.out.print(b);
	}