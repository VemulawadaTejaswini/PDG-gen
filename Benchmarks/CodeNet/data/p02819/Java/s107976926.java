import java.io.*;

class abc149c {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int X = Integer.parseInt(str);
        int i,j;
        int count = 0;
        int primary = 0;

        for(i=X;i<2*X;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count == 0){
                primary = i;
                break;
            }else{
                count = 0;
            }
        }
        System.out.println(primary);
    }
}