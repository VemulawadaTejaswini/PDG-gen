import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int juice;
		int[] weight = new int[10];
		int count;
		boolean firstOut;
		
		while(scan.hasNext()){
			juice = scan.nextInt();
			firstOut = false;
			count = 0;
			do{
				if(juice%2 == 1){
					weight[count] = 1;
				}else{
					weight[count] = 0;
				}
				count++;
				juice/=2;
			}while(juice > 0);
			
			for(int i=0;i<count;i++){
				if(weight[i]==1){
					System.out.print((int)Math.pow(2,i));
					firstOut = true;
				}
				if(i < 9){
					if(firstOut && weight[i+1]==1){
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
		scan.close();
	}
}