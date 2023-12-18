import java.io.*;

class abc148d {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        int n = Integer.parseInt(str1);

        int[] brick;
        brick = new int[n];
        int i,j,k = 0,count = 0;
        String str;

        for(i=0;i<n;i++){
            brick[i]=0;
        }

        for(i=0;i<n;i++){
            str = br.readLine();
            brick[i] = Integer.parseInt(str);
        }

        for(i=1;i<n+1;i++){
            for(j=k;j<n;j++){
                if(brick[j]==i){
                    k=j;
                    count++;
                    break;
                }
            }
            if(count!=i){
                break;
            }
        }

        if(count==0){
            System.out.println(-1);
        }else{
            System.out.println(n - count);
        }
    }
}