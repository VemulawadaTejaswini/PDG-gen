public class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int dataSet = scanner.nextInt();
		for(int i=0; i<dataSet; i++){
			int ab = (int)(Math.pow(scanner.nextInt(),2));
			int bc = (int)(Math.pow(scanner.nextInt(),2));
			int ac = (int)(Math.pow(scanner.nextInt(),2));
			
			if(ab==bc+ac){
				System.out.println("YES");
			}else if(bc==ab+ac){
				System.out.println("YES");
			}else if(ac==ab+bc){
				System.out.println("YES");
			}
			System.out.println("NO");
		}
		scanner.close();
		
	}	
}