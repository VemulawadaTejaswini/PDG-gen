import java.io.*;

class Main{
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int N = Integer.parseInt(br.readLine());
                int i = 0;
                int count = 0;
                while(i<N){
                        int r = Integer.parseInt(br.readLine());
                        if(r==2)
                                count++;
                        else if((r%2!=0)){
                                for(int j=3; j<=r; j+=2){
                                        if(r==j){
                                                count++;
                                                break;
                                        }
                                        if((r%j)==0)
                                                break;
                                }
                        }
                        i++;
                }
                System.out.println(count);
        }
}