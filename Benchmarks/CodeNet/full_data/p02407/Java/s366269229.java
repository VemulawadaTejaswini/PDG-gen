import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String kosu=br.readLine();
            int nako=Integer.parseInt(kosu);
            String strArr[] = br.readLine().split(" ");
            int[] a=new int[nako];

            for(int j=0; j<nako; j++){
                a[j]=Integer.parseInt(strArr[j]);
            }

            String aa="";
            for(int i=nako-1; i>=1; i--){
                aa=aa+""+(a[i]+" ");
            }aa=aa+""+a[0];

            System.out.println(aa);
            aa="";



    }
}