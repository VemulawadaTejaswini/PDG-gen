import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        String[] ans={};
        
        for(int i=0;i<n;i++){
            String[] str=bf.readLine().split(" ");
            int x=Integer.parseInt(str[0]);
            int y=Integer.parseInt(str[1]);
            int z=Integer.parseInt(str[2]);
            
            int k=(x*x)+(y*y);
            int j=z*z;
            
            if(k==j)
                ans[i]="YES";
            else
                ans[i]="NO";
        }
    }
}