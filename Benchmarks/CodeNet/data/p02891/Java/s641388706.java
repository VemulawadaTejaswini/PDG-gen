import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			String S = scan.next();
			char[]s = S.toCharArray();
			int K = scan.nextInt();

			ArrayList<Character>chara = new ArrayList<Character>();
			ArrayList<Integer>inte = new ArrayList<Integer>();

			char mem = 'a';
			int ok = 0;
			int count = 0;
			String ans = "";
			mem = s[0];
			count = 1;
			for(int i = 1;i<s.length;i++) {

				if(s[i]==mem) {
					count++;
					if(i==s.length-1) {
						ans+=String.valueOf(s[i-1])+" "+String.valueOf(count);
						chara.add(s[i-1]);
						inte.add(count);
					}
				}else if(s[i]!=mem) {
					ans+=String.valueOf(s[i-1])+" "+String.valueOf(count)+" ";
					chara.add(s[i-1]);
					inte.add(count);
					mem=s[i];count = 1;
					if(i==s.length-1) {
						ans+=String.valueOf(s[i])+" "+String.valueOf(count);
						chara.add(s[i-1]);
						inte.add(count);
					}
				}



			}



			/*

			for(Character c:chara) {
				System.out.println(c);
			}

			for(Integer i:inte) {
				System.out.println(i);
			}

			System.out.println(ans)
			*/


			if(chara.size()==1) {
				//int x = Integer.valueOf(ans.substring(1,ans.length()));
				//int A = K*(x/2);
				System.out.println(K*(inte.get(0)/2));
			}else{
				char f = chara.get(0);
				char l = chara.get(chara.size()-1);
				long goukei = 0;
				if(f==l) {
					long F = (long)inte.get(0)/2;
					long L = (long)inte.get(inte.size()-1)/2;
					goukei+=F;
					goukei+=L;
					goukei+=(K-1)*((F+L)/2);
					long p = 0;
					for(int i = 1;i<inte.size()-1;i++) {
						p+=(long)(inte.get(i)/2);
					}

					p+=(K-1)*p;
					goukei+=p;

					System.out.println(goukei);




				}else {

					for(Integer i:inte) {
						goukei+=(long)(i/2);
					}


					goukei+=(K-1)*goukei;
					System.out.print(goukei);

				}

			}





		}


	}


}
