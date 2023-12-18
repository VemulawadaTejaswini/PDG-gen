import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String[] a = new String[N];
		for(int i = 0;i<N;i++) {
			a[i]=sc.next();
		}
		int anagramct=0;
		for(int j=0;j<N;j++) {
			for(int k= j+1;k<N;k++) { 
		anagramct += MyisAnagram(a[j],a[k]);				
			}
		}
		System.out.print(anagramct+","+count);

	}
	static int MyisAnagram(String word1,String word2){
        int sumCode_1=0;
        int sumCode_2=0;
        
        if(word1.length()!=word2.length())
            return 0;
        
        for(int i=0;i<word1.length();i++){
            sumCode_1 += word1.charAt(i);
        }
        for(int i=0;i<word2.length();i++){
            sumCode_2 += word2.charAt(i);
        }
        
        if(sumCode_1 == sumCode_2){
            return 1;
        }
        else{
            return 0;
        }
    }
}
