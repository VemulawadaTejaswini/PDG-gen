public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()){
			
			int n = s.nextInt();
			int ptr =0;
			
			int[] prime = new int[1000];
			
			if(n>1){
				prime[ptr++] = 2;
			}
			if(n>2){
				prime[ptr++] = 3;
				for(int i = 5; i<= n ;i+=2){
					boolean check = true;
					for(int j = 1;j< ptr;j++){
						if(i % prime[j] == 0){
							check = false;
							break;
						}
						
					}
					if(check){
						//prime[ptr++] = i;
					}

				}
			}
			
			System.out.println(Integer.toString(ptr));

		}
	}
}