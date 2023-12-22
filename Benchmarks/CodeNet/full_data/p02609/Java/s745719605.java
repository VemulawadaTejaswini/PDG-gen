
import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        int N = Integer.parseInt(br.readLine());
        char[] word = br.readLine().toCharArray();
        BigInteger a = new BigInteger("0");
        for(int i=N-1;i>0;i--){
            if(word[i] == '1'){
                a = a.add(new BigInteger("2").pow(N-i-1));
            }
        }

        int count = 0;
        for(int i=0;i<N;i++){
            if(word[i] == '1')count++;
        }

//        System.out.println(a);
//        System.out.println("cnt :" + count);
        for(int i=0;i<N;i++){

            int cnt = 0;


            if(word[i] == '1'){

                count--;
                BigInteger temp = a.subtract(new BigInteger("2").pow(N-i-1));
                int mod = temp.mod(new BigInteger(Integer.toString(count))).intValue();
                cnt++;
                while(mod != 0){
                    mod = func(mod);
                    cnt++;
                }
                count++;
            }
            else{
                count++;

                BigInteger temp = a.add(new BigInteger("2").pow(N-i-1));
                int mod = temp.mod(new BigInteger(Integer.toString(count))).intValue();
                cnt++;
                while(mod != 0){
                    mod = func(mod);
                    cnt++;
                }

                count--;

            }

            bw.write(Integer.toString(cnt));
            bw.newLine();
        }
        bw.flush();
    }

    static int func(int number){

        char[] word = Integer.toBinaryString(number).toCharArray();
        int cnt = 0;
        for(char next : word){
            if(next == '1')cnt++;
        }

        return number % cnt;
    }
}
