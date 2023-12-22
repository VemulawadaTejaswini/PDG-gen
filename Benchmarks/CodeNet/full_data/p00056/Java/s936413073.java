import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(sc.hasNext()){
			count = 0;
			int n = sc.nextInt();
			if(n%2 != 0)continue;
			boolean c = true;
			for(int i = 4; i < n ; i++){
				int ne = n - i;
				for(int j = 2; j < ne ; j ++){
					if(ne % j == 0){
						c = false;
						break;
					}else{
						c = true;
					}
				}
				for(int j = 2; j < i ; j ++){
					if(i % j == 0){
						c = false;
						break;
					}else if(!c){
						c = true;
					}
				}
				if(c)count++;
			}
			System.out.println(count);
		}
		
	}	
}