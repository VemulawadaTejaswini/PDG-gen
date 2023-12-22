import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0;
		n = sc.nextInt();
		char[] key;
		char[][] word = new char[n][];
		key = sc.next().toCharArray();
		for (int i = 0; i < n; i++) {
			word[i] = sc.next().toCharArray();
Word:		for(int k = 0;k < word[i].length;k++){
				//System.out.println("1??????????????¢?????????");
				//System.out.println( key[0] +" " +word[i][k]);
				for(int l = k+1;l < word[i].length;l++){
					if(key[0] != word[i][k])break;
					//System.out.println("2??????????????¢?????????");
					//System.out.println( key[1] +" " +word[i][l]);
					for(int m = l + (l-k);m < word[i].length;m += (l-k)){
						if(key[1] != word[i][l])break;
						//System.out.println(((m-k)/(l-k))+"??????????????¢?????????");
						//System.out.println(l-k);
						//System.out.println( i +" "+ (m));
						//System.out.println( key[(m-k)/(l-k)] +" "/*+word[i][m]*/);
						if(key[(m-k)/(l-k)] != word[i][m])break;
						if((m-k)/(l-k) == key.length-1){
							cnt++;
							//System.out.println( "number " + i);
							break Word;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}