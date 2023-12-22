import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder builder = new StringBuilder();

		String str1 = br.readLine();

		String str2 = br.readLine();


		if(kmpMatcher(str1, str2)== -1){
			System.out.println("Yes");

		}else {
			System.out.println("No");
		}


	}
	private static int kmpMatcher(String text, String pattern) {
        int txtCsl = 1;
        int ptnCsl = 0;

        int[] skip = new int[pattern.length() + 1];

        skip[txtCsl] = 0;

        //????´¢????±???????????????????????????§
        while (txtCsl != pattern.length()) {
            //??????????????????????????????????????????
            if (pattern.charAt(txtCsl) == pattern.charAt(ptnCsl)) {
                skip[++txtCsl] = ++ptnCsl;
            } else if (ptnCsl == 0) {
                skip[++txtCsl] = ptnCsl;
            } else {
                ptnCsl = skip[ptnCsl];
            }
        }

        txtCsl = ptnCsl = 0;
        while (txtCsl != text.length() && ptnCsl != pattern.length()) {
            if (text.charAt(txtCsl) == pattern.charAt(ptnCsl)) {
                txtCsl++;
                ptnCsl++;
            } else if (ptnCsl == 0) {
                txtCsl++;
            } else {
                ptnCsl = skip[ptnCsl];
            }
        }

        if (ptnCsl == pattern.length()) {
            return txtCsl - ptnCsl;
        } else {
            return -1;
        }

    }
}