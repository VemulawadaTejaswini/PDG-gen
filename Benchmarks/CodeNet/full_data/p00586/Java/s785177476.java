	int main(){
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		while(true){
			if(!sc.hasNext())break;
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
		return 0;
	}