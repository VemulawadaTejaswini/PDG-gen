import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
		char smallL[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int A[] = new int[smallL.length];
		String str = br.readLine();
		str = str.toLowerCase();
		char[] charArray;

		while(str != null){
			charArray = str.toCharArray();
			for(int i = 0 ; i < charArray.length ; i++){
				for(int j = 0 ; j < smallL.length ; j++){
					if(charArray[i] == smallL[j]){
						++A[j];
						break;
					}
				}
			}
			str = str.toLowerCase();
		}

		for(int i = 0 ; i < smallL.length ; i++){
			System.out.println(smallL[i] + " : " + A[i]);
		}

	}
}