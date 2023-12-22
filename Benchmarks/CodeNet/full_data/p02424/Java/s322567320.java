import java.util.*;

class Main{
	static final int nbits = 32;
	static BitSet bs;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		BitSet bsa = new BitSet(nbits);
		BitSet bsb = new BitSet(nbits);
		for(int i = 0; i < nbits; i++){
			if((a & (1 << i)) != 0) bsa.set(i);
		}
		for(int i = 0; i < nbits; i++){
			if((b & (1 << i)) != 0) bsb.set(i);
		}
		makeBitSet(bsa);
		bs.and(bsb);
		printBitSet(bs);
		System.out.print("\n");
		makeBitSet(bsa);
		bs.or(bsb);
		printBitSet(bs);
		System.out.print("\n");
		makeBitSet(bsa);
		bs.xor(bsb);
		printBitSet(bs);
		System.out.print("\n");
	}
	static void makeBitSet(BitSet b){
		bs = new BitSet(nbits);
		for(int i = 0; i < nbits; i++){
			if(b.get(i)) bs.set(i);
		}
	}
	static void printBitSet(BitSet b){
		for(int i = nbits - 1; i >= 0; i--){
			if(b.get(i)) System.out.print(1);
			else System.out.print(0);
		}
	}
}

