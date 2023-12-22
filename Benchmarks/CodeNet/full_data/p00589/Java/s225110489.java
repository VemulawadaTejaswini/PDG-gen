import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[][] inputs = {
				{' '},
				{'\'', ',', '.' , '!', '?'},
				{'a', 'b', 'c', 'A', 'B', 'C'},
				{'d', 'e', 'f', 'D', 'E', 'F'},
				{'g', 'h', 'i', 'G', 'H', 'I'},
				{'j', 'k', 'l', 'J', 'K', 'L'},
				{'m', 'n', 'o', 'M', 'N', 'O'},
				{'p', 'q', 'r' , 's', 'P', 'Q', 'R' , 'S'},
				{'t', 'u', 'v', 'T', 'U', 'V'},
				{'w', 'x', 'y', 'z', 'W', 'X', 'Y' , 'Z'},
		};
		
		while(sc.hasNext()){
			char[] in = sc.next().toCharArray();
			
			boolean find = false;
			int cur = -1;
			int count = 0;
			for(int i = 0; i < in.length; i++){
				if(!find){
					if(in[i] == '0'){
						System.out.print(inputs[cur][(count - 1) % inputs[cur].length]);
						cur = -1;
						count = 0;
						find = true;
					}else{
						if(cur != in[i] - '0' && count > 0){
							System.out.print(inputs[cur][(count - 1) % inputs[cur].length]);
							cur = in[i] - '0';
							count=1;
						}else{
							cur = in[i] - '0';
							count++;
						}
					}
				}else{
					if(in[i] == '0'){
						//System.out.println("he");
						System.out.print(inputs[0][0]);
					}else{
						find = false;
						cur = in[i] - '0';
						count++;
					}
				}
			}
			
			if(cur != -1 && count > 0){
				System.out.print(inputs[cur][(count - 1) % inputs[cur].length]);
			}
			
			System.out.println();
			
		}
	}
}