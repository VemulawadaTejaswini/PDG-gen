import java.io.*;

class abc148a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int A = Integer.parseInt(str1);
        int B = Integer.parseInt(str2);

        if(A!=1 && B!=1)
            System.out.println(1);
        else if(A!=2 && B!=2)
            System.out.println(2);
        else    
            System.out.println(3);        
    }
}