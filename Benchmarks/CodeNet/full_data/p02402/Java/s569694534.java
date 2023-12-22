import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(buf.readLine());
        String num[]=buf.readLine().split(" ");
        int max=-99999999,min=99999999;
        long sum=0;
        for(int i=0;i<num.length;i++){
            int tmp=Integer.parseInt(num[i]);
            if(tmp>max){
                max=tmp;
            }if(tmp<min){
                min=tmp;
            }
            sum +=tmp;
                
        }
        System.out.println(min+" "+max+" "+sum);
    }
}