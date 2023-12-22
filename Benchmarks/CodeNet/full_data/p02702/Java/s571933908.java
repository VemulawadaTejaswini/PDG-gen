import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

    public static void main(String[] args) {
        String[] n=new String[100];
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            n=br.readLine().split("");
        }catch (IOException e){
            e.printStackTrace();
        }
        int len=n.length;
        int rs=0;
        int start=0;
        int end=0;
        int num=0;
        for (int i = 1; i < len-2; i++) {
            start=0;
            end=len-i;
            for (int j = 0; j < i; j++) {
                num=0;
                for (int k = 0; k < end + 1; k++) {
                    num+=Integer.parseInt(n[j+k])*Math.pow(10,end-k);
                }
                if (num%2019==0){
                    rs++;
                }
            }
        }
        System.out.println(rs);
    }
}