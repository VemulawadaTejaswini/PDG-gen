import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[26];
        Arrays.fill(num, 0);
        char alp = 'a';
        String str;

        while((str = in.readLine()) != null){
            str = str.toLowerCase();
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) - alp <= str.length()){
                    num[str.charAt(i) - alp]++;
                }
            }
        }

        for(int i=0; i<num.length; i++){
            System.out.println(alp++ + " : " + num[i]);
        }

        in.close();
    }
}