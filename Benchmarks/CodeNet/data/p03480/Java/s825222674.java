import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		char[] cs = string.toCharArray();
		int count = 0;
		int[] box = new int[string.length()];
		for(int i = 0;i < string.length();i++){
			if(cs[i] == '0'){
				box[i] = 0;
			}else{
				box[i] = 1;
			}
		}
		for(int i = 0;i < string.length();i++){
			if(box[i] == 1){
				int j = i+1;
				while(true){
					
					if(j == string.length()){
						break;
					}
					if(box[j]==1){
						break;
					}
					j++;
				}
				box =  changebox(box,i,j);
				count++;
				
			}
			
		}
		System.out.println(count);

	}
	
	
	static int[] changebox(int[] box,int s,int g){
		for(int i = s;i < g;i++){
			if(box[i] == 0){
				box[i] =1;
				
			}else{
				box[i] = 0;
			}
		}
		return box;
		
	}
}

