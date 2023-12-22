import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] str = br.readLine().split(" ");
            int m = Integer.parseInt(str[0]);
            int f = Integer.parseInt(str[1]);
            int r = Integer.parseInt(str[2]);

            int sum = m+f;

            if(m==-1 && f==-1 && r ==-1)break;
            if(sum<30 || m==-1 || f==-1){
                System.out.println("F");
            }else if(sum>=80){
                System.out.println("A");
            }else if(sum>=65 && sum<80){
                System.out.println("B");
            }else if(sum>=50 && sum<65 || r>=50){
                System.out.println("C");
            }else if(sum>=30 && sum<50){
                System.out.println("D");
            }
        }
    }
}