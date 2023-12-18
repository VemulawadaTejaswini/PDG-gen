import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        str = br.readLine();
        long[] a = new long[N];
        int cont = 0;
        for (String s:str.split(" ")){
            a[cont] = Integer.parseInt(s);
            cont++;
        }
        boolean res;
        int ans = 0;
        while (true){
            res = false;
            for (int i=0;i<N;i++){
                if (a[i]%2==0 && res==false){
                    a[i]/=2;
                    res = true;
                } else {
                    a[i]*=3;
                }
            }
            if (res==true){
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}