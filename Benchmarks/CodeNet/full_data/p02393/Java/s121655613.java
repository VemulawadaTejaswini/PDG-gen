int s[]=new int[3];
		int i,j;
		j = 0;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<s.length;i++){
		s[i]= sc.nextInt();
		}
		
		Arrays.sort(s);
		
		for(i = 0; i < s.length; i++){
			System.out.print(s[i]);
			if(i <s.length - 1){
				System.out.print(" ");
			}