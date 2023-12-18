

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{

    public static void main(String[] args) {

        try {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String []i = br.readLine().trim().split(" ");
            int a=Integer.parseInt(i[0]);
            int b=Integer.parseInt(i[1]);
            int c=Integer.parseInt(i[2]);
            int d=Integer.parseInt(i[3]);
            while(a>0||c>0){
                c=c-b;
                if(c<=0){
                    System.out.print("Yes");
                    break;
                }
                a=a-d;
                if(a<=0){
                    System.out.print("No");
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}