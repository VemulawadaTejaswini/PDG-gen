import java.io.*;

class Main{
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[] args) throws IOException{
                int n1 = Integer.parseInt(br.readLine());
                int[] a1 = new int[n1];
                String[] s1 = br.readLine().split(" ");
                for(int i=0; i<n1; i++)
                        a1[i] = Integer.parseInt(s1[i]);
                int n2 = Integer.parseInt(br.readLine());
                int[] a2 = new int[n2];
                String[] s2 = br.readLine().split(" ");
                for(int i=0; i<n2; i++)
                        a2[i] = Integer.parseInt(s2[i]);

                int ans = 0;
                for(int i: a2){
                        int m = n1/2;
                        int s = m/2;
                        for(int j=0; j<n1; j++){
                                if(m<0 || m>=n1)
                                        break;
                                if(a1[m] == i){
                                        ans++;
                                        break;
                                }
                                s = s/(2*(j+1));
                                if(s==0)
                                        s=1;
                                m = (a1[m]<i) ? m+s : m-s;
                        }
                }
                System.out.println(ans);
        }
}