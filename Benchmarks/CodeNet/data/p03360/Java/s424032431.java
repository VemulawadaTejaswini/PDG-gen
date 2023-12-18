public class Main {

	public static void main(String[] args) {
		int[] kokuban=new int[3];
		for(int i=0;i<3;i++) {
		kokuban[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<3;i++) {
			System.out.print(kokuban[i]+" ");
			}
		int K=Integer.parseInt(args[3]);
		System.out.println("");
		System.out.println(K);
		for(int i=0;i<3;i++) {
		if(kokuban[i]<1||kokuban[i]>50) {
			System.out.println(i+"番目の値が不正です");
			System.exit(1);
			}
		}
		if(K<1||K>10) {
			System.out.println("Kの値が不正です");
			System.exit(1);
			}
		int max=0;
		for(int z=0;z<K;z++) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(kokuban[i]>kokuban[j])max=i;

			}
		}
		kokuban[max]*=2;
		}
		int sum=0;
		for(int i=0;i<3;i++)sum+=kokuban[i];
		System.out.print(sum);
		}
	}
