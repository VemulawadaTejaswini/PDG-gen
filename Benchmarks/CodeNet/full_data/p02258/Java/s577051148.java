import java.io.*;

class Main{
    
        public static int maxv(int x, int y){
            if(x >= y){
                return x;
            }else{
                return y;
            }
        }

        public static int minv(int x, int y){
            if(x <= y){
                return x;
            }else{
                return y;
            }
        }

    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                    int N = Integer.parseInt(reader.readLine());;
                    

                    int[] a = new int[N];

                    for(int i = 0; i < N; i ++){
                        a[i] = Integer.parseInt(reader.readLine());
                    }

                    int min = a[0];
                    int max = a[1] - a[0];

                    for(int i = 0; i < (N- 1); i++){
                        min = minv(min, a[i]);
                        max = maxv(max, (a[i + 1] - min));
                    }

                    System.out.println(max);
                            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}