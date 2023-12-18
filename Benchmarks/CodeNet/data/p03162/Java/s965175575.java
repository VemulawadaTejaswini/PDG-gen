
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    static int line;
    static int[][] abc;
    static int[][] maxabc;

    static void maxHappiness(){
        maxabc[0][0] = abc[0][0];
        maxabc[0][1] = abc[0][1];
        maxabc[0][2] = abc[0][2];
        for(int i=1;i<line;i++){
            maxValue(i);
        }
    }
    static void maxValue(int l){

        int a = abc[l][0] + maxabc[l-1][1];
        int b = abc[l][0] + maxabc[l-1][2];
        if(a>b){
            maxabc[l][0] = a;
        }
        else{
            maxabc[l][0] = b;
        }

        int c = abc[l][1] + maxabc[l-1][0];
        int d = abc[l][1] + maxabc[l-1][2];
        if(c>d){
            maxabc[l][1] = c;
        }
        else{
            maxabc[l][1] = d;
        }

        int e = abc[l][2] + maxabc[l-1][0];
        int f = abc[l][2] + maxabc[l-1][1];
        if(e>f){
            maxabc[l][2] = e;
        }
        else{
            maxabc[l][2] = f;
        }
    }
    static int ans(){
        int[] a = new int[3];
        a[0] = maxabc[line-1][0];
        a[1] = maxabc[line-1][1];
        a[2]= maxabc[line-1][2];

        int out = 0;

        for(int i=0;i<3;i++){
            if(a[i]>out){
                out = a[i];
            }
        }
        return out;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

        String ln = inp.readLine();

        line = Integer.parseInt(ln);
        abc = new int[line][3];
        maxabc = new int[line][3];

        for(int l=0;l<line;l++){
            String[] ABC = inp.readLine().split(" ");
            for (int i=0;i<3;i++){
                abc[l][i] = Integer.parseInt(ABC[i]);
            }
        }
        maxHappiness();
//        for (int i=0;i<line;i++){
//            System.out.println(maxabc[i][0]+" "+maxabc[i][1]+" "+maxabc[i][2]);
//        }
        System.out.println(ans());

    }
}
