import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int idx=Integer.parseInt(buf.readLine()); 
        int ans=0;
        for(int i=0; i<idx;i++){
           int x=Integer.parseInt(buf.readLine());
           for(int j=2;j<x;j+=2){
        if(x<2){
            break;
        }else if(x==2){
            ans++;
                }else if(x%2==0){
                break;
                }else if(x%i==0){
                    break;
                }else ans++;
           }
        }
        System.out.println(ans);
    }
}