import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 String [] s = new String [N];

		 for(int i=0;i<N;i++) {
			 s[i] = scan.next();
		 }
		 scan.close();
		 long c=0;

		 for(int i=0;i<N-1;i++) {

			 for(int j=i+1;j<N;j++) {


				  if(MyisAnagram(s[i],s[j])) {
					  c++;
				  }
			 }
		 }
		 System.out.println(c);
	}

	static boolean MyisAnagram(String word1,String word2){
        int sumCode_1=0;
        int sumCode_2=0;

        if(word1.length()!=word2.length())
            return false;

        for(int i=0;i<word1.length();i++){
            sumCode_1 += word1.charAt(i);
        }
        for(int i=0;i<word2.length();i++){
            sumCode_2 += word2.charAt(i);
        }

        if(sumCode_1 == sumCode_2){
            return true;
        }
        else{
            return false;
        }

    }

}