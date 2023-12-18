import java.util.Scanner;

public class Main {
	static int count=0;
	static int k;
	public static void main(String[] args) {
		int[][] pop = new int[84][3];
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();

		int num=0;
			int pi=0;
			for(int three=1;three<9;three++) {
				for(int five=1;five<9;five++) {
					for(int seven=1;seven<9;seven++) {
						if(three+five+seven<=9) {
							pop[num][0]=three;
							pop[num][1]=five;
							pop[num++][2]=seven;
						}
					}
				}
			}
//			System.out.println(pop.length);
		for(int[] h:pop) {
			int[] ss=new int[h[0]+h[1]+h[2]];
			int i=0;
			for(int p=0;p<h[0];p++)ss[i++]=3;
			for(int p=0;p<h[1];p++)ss[i++]=5;
			for(int p=0;p<h[2];p++)ss[i++]=7;
			permutation(ss);
//			System.out.println(ss.length);
//	    	int w=0;
//			for(int s=0;s<ss.length;s++) {
//				for(int m=1;m<ss.length-s;m++)ss[s]*=10;
//				w+=ss[s];
//			}
//			System.out.println(w);
		}
		System.out.println(count);
	}
    private static void permutation(int[] seed) {
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        buildPerm(seed, perm, used, 0);
    }

    private static void buildPerm(int[] seed, int[] perm, boolean[] used, int index) {
        if (index == seed.length) {
            procPerm(perm);
            return;
        }

        for (int i = 0; i < seed.length; ++i) {
            if (used[i]) continue;
            perm[index] = seed[i];
            used[i] = true;
            buildPerm(seed, perm, used, index + 1);
            used[i] = false;
        }
    }

    private static void procPerm(int[] perm) {
    	int num=0;
		for(int s=0;s<perm.length;s++) {
			int tem=perm[s];
			for(int i=1;i<perm.length-s;i++)tem*=10;
			num+=tem;
		}
//		System.out.println(num);
		if(num<=k && num>0) {

			count++;
		}
    }
}
