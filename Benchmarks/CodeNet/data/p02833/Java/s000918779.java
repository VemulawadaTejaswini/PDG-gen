import java.io.*;

class abc148e{
    public static void main(String[] args) throws IOException{
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(str);
        int count = 0;

        for(int i=n;i>1;i=i-2){
            int j = i;
            while(j%10==0 && j > 8){
                j = j / 10;
                count++;
            }
        }

        System.out.println(count);
    }
}