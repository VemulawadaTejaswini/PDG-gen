import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] XYZK = new int[4];
        int cont = 0;
        for (String s:str.split(" ")){
            XYZK[cont] = Integer.parseInt(s);
            cont++;
        }
        long[] A = new long[XYZK[0]];
        long[] B = new long[XYZK[1]];
        long[] C = new long[XYZK[2]];
        str = br.readLine();
        cont = 0;
        for (String s:str.split(" ")){
            A[cont] = Long.parseLong(s);
            cont++;
        }
        str = br.readLine();
        cont = 0;
        for (String s:str.split(" ")){
            B[cont] = Long.parseLong(s);
            cont++;
        }
        str = br.readLine();
        cont = 0;
        for (String s:str.split(" ")){
            C[cont] = Long.parseLong(s);
            cont++;
        }
        Long[] AB = new Long[XYZK[0]*XYZK[1]];
        cont = 0;
        for (int a=0;a<XYZK[0];a++){
            for (int b=0;b<XYZK[1];b++){
                AB[cont] = A[a] + B[b];
                cont++;
            }
        }
        Arrays.sort(AB,Collections.reverseOrder());
        int min;
        if (XYZK[3]<AB.length){
            min = XYZK[3];
        } else {
            min = AB.length;
        }
        Long[] ABC = new Long[min*XYZK[2]];
        cont = 0;
        for (int ab=0;ab<min;ab++){
            for (int c=0;c<XYZK[2];c++){
                ABC[cont] = AB[ab] + C[c];
                cont++;
            }
        }
        Arrays.sort(ABC,Collections.reverseOrder());
        for (int i=0;i<XYZK[3];i++){
            System.out.println(ABC[i]);
        }
    }
}