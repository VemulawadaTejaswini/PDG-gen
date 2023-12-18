import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		boolean ans=true;
//		S.replace('o', 'n');
		int[] countlist = new int[27];
		int[] Tcountlist = new int[27];
		char[] chlist = new char[27];
		char[] tailist = new char[27];
		for(int num=0;num<27;num++) {
			countlist[num]=0;
			Tcountlist[num]=0;
			chlist[num]=100;
			tailist[num]=100;
		}


		for(int index=0;index<S.length();index++) {
			//System.out.println(S.charAt(index)-'a');
			countlist[S.charAt(index)-'a']++;
			if(countlist[S.charAt(index)-'a']==1) {//aの数
				tailist[S.charAt(index)-'a']=T.charAt(index);//aの対応
			} else {
				if(tailist[S.charAt(index)-'a']!=T.charAt(index)) {//aの対応が今の対応と違う
					ans=false;
				}
			}
//			System.out.println(String.valueOf(tailist[S.charAt(index)-'a']));
			//System.out.println(String.valueOf(tailist[S.charAt(index)-'a'])+"  "+String.valueOf((chlist[T.charAt(index)-'a'])));
		}
		for(int index=0;index<S.length();index++) {
			//System.out.println(T.charAt(index)-'a');
			Tcountlist[T.charAt(index)-'a']++;
			if(Tcountlist[T.charAt(index)-'a']==1) {//bの数
				chlist[T.charAt(index)-'a']=S.charAt(index);//bの対応
			} else {
				if(chlist[T.charAt(index)-'a']!=S.charAt(index)) {//bの対応が今の対応と違う.
					ans=false;
				}
			}
//			System.out.println(String.valueOf(chlist[T.charAt(index)-'a']));
		}

		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
