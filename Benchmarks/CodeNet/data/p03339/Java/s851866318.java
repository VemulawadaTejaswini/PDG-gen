class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int countDiff = 0;

		int permMax = scan.nextInt();
		String perm = scan.next();

		System.out.println(permMax);
		System.out.println(perm);

		//slim
		char pre = '0';
		for(char next : perm.toCharArray()){
			//first time
			if(pre == '0'){
				pre = next;
				countDiff++;
				continue;
			}

			//different arrow
			if(pre != next){
				countDiff++;
			}

			//set next
			pre = next;
		}

		//print
		System.out.println(countDiff / 2);
	}
}