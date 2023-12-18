import java.io.*;

class abc141a{
    public static void main(String[] args) throws IOException{
        BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

    String str_n = br.readLine();
    String str_a = br.readLine();
    String str_b = br.readLine();

    int n = Integer.parseInt(str_n);
    int a = Integer.parseInt(str_a);
    int b = Integer.parseInt(str_b);

    if(a*n<=b){
        System.out.println(a*n);
    }else{
        System.out.println(b);
    }

}