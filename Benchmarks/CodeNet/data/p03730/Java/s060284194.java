import java.io.*;
class Main{
    public static void main(String[] args)throws IOException{
        int a,b,c,i;
        int sum=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());

        for(i=1;i<=100;i++){
            sum=a*i;
            if(sum%b==c){
                break;
            }
        }
        if(sum%b==c){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
