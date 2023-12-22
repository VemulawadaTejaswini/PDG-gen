/*AOJ-ITP-3-2*/

class Main{
	public static void main(String[] args)  {
		int i = 0;
		int[] loadNumber = new int [10000];
		while(true){
			loadNumber[i] = new java.util.Scanner(System.in).nextInt();
			if(loadNumber[i] == 0){
				for(int j = 1 ; j <= i ; j++){
					System.out.println("Case " + j + ": " + loadNumber[j-1]);
				}
				break;
			}
			i++;
		}
	}
}