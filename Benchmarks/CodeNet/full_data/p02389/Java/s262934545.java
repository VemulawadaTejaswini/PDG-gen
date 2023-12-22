import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	String[] str1 = str.split(" ",0);
	
	int[] str2 = new int[str1.length];
	for (int i = 0; i < str1.length ; i++) {
	    str2[i] = Integer.parseInt(str1[i]);
	}
	int res1 = str2[0] * str2[1];
	int res2 = (str2[0]+str2[1]) * 2;
	System.out.println(res1 +" "+ res2);

    }
}