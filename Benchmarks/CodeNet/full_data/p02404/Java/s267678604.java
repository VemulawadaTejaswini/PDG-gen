import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        
        int h,w,i,j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String[] str = br.readLine().split(" ");
            h = Integer.parseInt(str[0]);
            w = Integer.parseInt(str[1]);
            
            if(h == 0 && w ==0){
                break;
            }
            
            for(i = 0; i < h; i++){
                for(j = 0; j < w; j++){
                    if(i==0 && i==h-1){
                        System.out.printf("#");
                    }else if(j==0 && j==w-1){
                        System.out.printf("#");
                    }else{
                        System.out.printf(".");
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}