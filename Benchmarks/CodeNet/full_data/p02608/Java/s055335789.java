public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int hako[]=new int[n];
		/*for(int i=1;i<=n;i++) {
			hako[i]=sc.nextInt();
		}*/
		for(int i=1;i<=n;i++) {
			s:for(int x=1;x<=i;x++) {
				for(int y=1;y<=i;y++) {
					for(int z=1;z<=i;z++) {
						if((x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x)==i && x==y && y==z && z==x) {
							ans=1;
							System.out.println(ans);
							ans=0;
							break s;
						}
						else if((x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x)==i || i==17) {
							ans=3;
							System.out.println(ans);
							ans=0;
							break s;
						}
						else if((x*x)+(y*y)+(z*z)+(x*y)+(y*z)+(z*x)>2*i) {
							ans=0;
							System.out.println(ans);
							ans=0;
							break s;
						}
					}
				}
			}
		}
		
		
	}