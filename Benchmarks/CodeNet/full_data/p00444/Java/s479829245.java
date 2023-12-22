	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int x,ans;
			x=cin.nextInt();
			if(x==0){
				break;
			}
				x=1000-x;
				ans=x/500;
				x=x%500;
				ans=ans+x/100;
				x=x%100;
				ans=ans+x/50;
				x=x%50;
				ans=ans+x/10;
				x=x%10;
				ans=ans+x;
				System.out.println(ans);
		}
		
			

	}