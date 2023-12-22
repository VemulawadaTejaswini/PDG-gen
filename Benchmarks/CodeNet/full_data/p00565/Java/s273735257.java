import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");

        int max = 0;
        boolean onCheck = false;
        int cl = 1; // 現在地点？

        for(String x : A){
            if(x.equals("1")){
                cl++; //2,1
                onCheck = true;
            }else if(onCheck){           //0100
                max = Math.max(cl,max);  //2,
                cl = 1;
                onCheck = false;
            }
        }

        max = Math.max(cl,max);

        System.out.println(max);
    }
}
