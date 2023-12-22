import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int array[]=new int[150];
		int count=0,a,b;
		while(true){
			for(int i=0;i<150;i++){
				array[i]=0;
			}
			while(true){
				a=scan.nextInt();
				b=scan.nextInt();	
				array[a]++;
				array[b]++;
				if(a==0){
					if(b==0){
						break;
					}
				}
			}
			for(int i=0;i<150;i++){
				if(array[1]%2==1&&array[2]==2){
					if(array[i]%2==0){
						if(i==150){
							System.out.println("OK");
						}
					}
					else{
						System.out.println("NG");
						break;
					}
				}
				else{
					System.out.println("NG");
					break;
				}
			}
			if(!scan.hasNext()){
				break;
			}
		}
	}
}