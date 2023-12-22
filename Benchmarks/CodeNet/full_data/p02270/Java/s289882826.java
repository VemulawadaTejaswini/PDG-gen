import java.io.*;

class Main{
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[] args) throws IOException{
                String[] line = br.readLine().split(" ");
                int num = Integer.parseInt(line[0]);
                int truck = Integer.parseInt(line[1]);
                int[] weight = new int[num];
                int ave = 0;
                int max = 0;
                for(int i=0; i<num; i++){
                        weight[i] = Integer.parseInt(br.readLine());
                        ave += weight[i];
                        if(max<weight[i])
                                max = weight[i];
                }
                int s = ave%truck;
                ave /= truck;
                if(s>0)
                        ave++;

                if (ave<max)
                        ave=max;
                int ans=ave;
                int m=1;
                for(;m!=0;ans++){
                        int c = 0;
                        for(int i=0; i<num;){
                                int t = 0;
                                while(i<num){
                                        if((t+weight[i])>ans)
                                                break;
                                        t += weight[i];
                                        i++;
                                }
                                c++;
                        }
                        m=c-truck;
                }
                System.out.println(ans-1);
        }
}