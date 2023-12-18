import java.util.Scanner;

public class Main {
	private static int min=100000000;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] p=new int[5];
		p[0]=sc.nextInt();
		p[1]=sc.nextInt();
		p[2]=sc.nextInt();
		p[3]=sc.nextInt();
		p[4]=sc.nextInt();
		sc.close();
		String key="01234";
		permutation(key,"",p);
		System.out.println(min);
	}

	public static void permutation(String q, String ans,int[] p){
		if(q.length() <= 1) {
			char[] ch=(ans+q).toCharArray();
			int val=0;
			for(int i=0;i<ch.length;i++){
        		int mod=val%10;
        		if(mod!=0)val +=(10-mod);
				int v=Character.getNumericValue(ch[i]);
        		val +=p[v];
			}
			min=Math.min(min, val);
		} else {
			for (int i = 0; i < q.length(); i++) {
				permutation(q.substring(0, i) + q.substring(i + 1),ans + q.charAt(i),p);
			}
		}
	}
}