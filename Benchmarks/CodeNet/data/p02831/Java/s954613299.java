import java.io.*;

class abc148c {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int A = Integer.parseInt(str1);
        int B = Integer.parseInt(str2);
        int C = 0;
        int a = 0;
        int b = 0;

        if(A < B){
            C = A;
            A = B;
            B = C;
        }

        a = A;
        b = B;

        while(b!=0){
            C = a % b;
            a = b;
            b = C;
        }

        if(a==1){
            System.out.println(A*B);
        }else{
            System.out.println(A*B/C);
        }
    }
}