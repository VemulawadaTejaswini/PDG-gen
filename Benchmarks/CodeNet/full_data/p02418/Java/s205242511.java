import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder builder = new StringBuilder();

		String str1 = br.readLine();

		String str2 = br.readLine();


		if(kmpSearch(str1+str1, str2)== -1){
			System.out.println("No");

		}else {
			System.out.println("Yes");
		}


	}


 private static int kmpSearch(String text, String pattern){
  int textIndex = 1;
  int patternIndex = 0;
  int[] cacheTable = new int[pattern.length() + 1];
  cacheTable[0] = cacheTable[1] = 0;

  while(pattern.length() > textIndex ){
   if(pattern.charAt(textIndex) == pattern.charAt(patternIndex)){

    textIndex++;
    patternIndex++;
    cacheTable[textIndex] = patternIndex;
   } else if (patternIndex == 0){

    textIndex++;
    cacheTable[textIndex] = 0;
   } else {

    patternIndex = cacheTable[patternIndex];
   }
  }

  int i = 0;
  int n = 0;
  while(n < text.length()) {

   if(text.charAt(n) == pattern.charAt(i)){
    ++n;
    ++i;
    if(pattern.length() == i){

     return n - pattern.length();
    }
   } else if ( i == 0){

    ++n;
   } else {

    i = cacheTable[i];
   }
  }

  return -1;
 }

}