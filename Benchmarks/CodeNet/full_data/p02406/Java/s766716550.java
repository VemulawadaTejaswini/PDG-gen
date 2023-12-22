import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int ans=Integer.parseInt(buf.readLine());
        StringBuilder sbu=new StringBuilder();
        int j;
        for(int i=3; i <= ans; i++){
            if(i%3==0){
                sbu.append(" "+i);
            }else{
                j=i;
                while(j!=0){
                    if(j%10==3){
                        sbu.append(" "+i);break;
                    }else{
                        j=j/10;
                    }
                }
            }
        }
        System.out.print(sbu);
    }
}