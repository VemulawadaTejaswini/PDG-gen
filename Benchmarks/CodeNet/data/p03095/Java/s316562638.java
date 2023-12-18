import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] cou = new int[1000000];
		int ans = 0;
		for(int i = 0; i < n; i++){
			ans++;
			//System.out.println(1);
			cou[s.charAt(i)]++;
			int jou = 0;
			for(int j = 1; i+j < n; j++){
				if(s.charAt(i)==s.charAt(i+j)){
					//System.out.println("a");
				}else if(cou[s.charAt(i+j)] == 0){
					ans+=Math.pow(2,jou);
					jou++;
					//System.out.print("b");
					//System.out.println(Math.pow(2,jou-1));
				}else{
					ans+=Math.pow(2,jou-cou[s.charAt(i+j)]);
					//System.out.println(Math.pow(2,jou-cou[s.charAt(i+j)]));
					jou++;
					//System.out.printf("%c,%d,\n",s.charAt(i+j),cou[s.charAt(i+j)]);
				}
				cou[s.charAt(i+j)]++;
			}
			Arrays.fill(cou,0);
		}
		System.out.print(ans);
	}
}
