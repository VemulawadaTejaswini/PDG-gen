import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			ByteSequence bs = new ByteSequence(line);
			System.out.println(bs.getBottommost());
		}
		sc.close();
	}
	
}

class ByteSequence{
	byte[] sequence;
	
	ByteSequence(byte[] bs){
		this.sequence = bs;
	}
	ByteSequence(String str){
		byte[] bs = new byte[str.length()];
		for(int i = 0; i < str.length(); i++) {
			bs[i] = Byte.valueOf(str.substring(i, i+1));
		}
		this.sequence = bs;
	}
	
	ByteSequence nextSequence() {
		byte[] result = new byte[sequence.length-1];
		for(int i = 0; i < sequence.length-1; i++) {
			result[i] = (byte) ((sequence[i] + sequence[i+1]) % 10);
		}
		return new ByteSequence(result);
	}
	
	byte getBottommost() {
		ByteSequence next = this.nextSequence();
		if(next.sequence.length == 1) return next.sequence[0];
		else return next.getBottommost();
	}
}