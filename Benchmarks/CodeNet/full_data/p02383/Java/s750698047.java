import java.io.*;

class Main{
	public static void main(String args[])throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String[] str = buf.readLine().split(" ");
		String direction = buf.readLine();
		int[] num = new int[6];

		for(int i=0; i<6; i++){
			num[i] = Integer.parseInt(str[i]);
		}
		DiceI sk = new DiceI(num,direction);
		System.out.println(sk.getSide());
	}	
}
class DiceI{
	char c;
	int tmp;
	int value=0;

	public Saikoro(int[] num, String direction){
		for(int i=0; i<direction.length(); i++){
			c = direction.charAt(i);
			switch (c) {
	        case 'N':
	            tmp = num[0];
	            num[0] = num[1];
	            num[1] = num[5];
	            num[5] = num[4];
	            num[4] = tmp;
	            
	            break;
	        case 'W':
	        	tmp = num[0];
	            num[0] = num[2];
	            num[2] = num[5];
	            num[5] = num[3];
	            num[3] = tmp;         
	            break;
	        case 'E':
	        	tmp = num[0];
	            num[0] = num[3];
	            num[3] = num[5];
	            num[5] = num[2];
	            num[2] = tmp;
	            break;
	        case 'S':
	        	tmp = num[0];
	            num[0] = num[4];
	            num[4] = num[5];
	            num[5] = num[1];
	            num[1] = tmp;
	            break;
	        default:
			}
			value = num[0];
		}
	}
	public int getSide(){
		return value;
	}

}